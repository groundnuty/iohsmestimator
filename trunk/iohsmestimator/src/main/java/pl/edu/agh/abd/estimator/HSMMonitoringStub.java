package pl.edu.agh.abd.estimator;



import javax.ws.rs.core.MultivaluedMap;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.client.apache.ApacheHttpClient;
import com.sun.jersey.client.apache.config.DefaultApacheHttpClientConfig;
import com.sun.jersey.core.util.MultivaluedMapImpl;

import pl.edu.agh.abd.ConfigProperties;
import pl.edu.agh.storage.estimation.hsmclient.Drive;
import pl.edu.agh.storage.estimation.hsmclient.HSM;
import pl.edu.agh.storage.estimation.hsmclient.HSMFile;
import pl.edu.agh.storage.estimation.hsmclient.HSMFileWrapper;
import pl.edu.agh.storage.estimation.hsmclient.HSMWrapper;
import pl.edu.agh.storage.estimation.hsmclient.Library;
import static pl.edu.agh.abd.ConfigProperties.*;

/**
 * created at: Jan 15, 2011, 8:06:23 AM
 *
 * @author: Michal Orzechowski
 */
public class HSMMonitoringStub{
	Gson transformer;
	Client client;
	ConfigProperties prop;
	
	private float cachedLatency;
	private float positioningLatency;	//averagePositionTime
	private float loadTapeLatency;		//averageLoadTime
	private float unloadTapeLatency;	//averageUnloadTime
	private HSMFile[] filesInAQueue = new HSMFile[0];
	private float systemTransferRate;	//averageReadTransferRate
	private HSM hsm;
	private Library library;
	private Drive drive;
	
	@SuppressWarnings("static-access")
	public HSMMonitoringStub(){
		transformer = new Gson();
		DefaultApacheHttpClientConfig config = new DefaultApacheHttpClientConfig();
		config.getProperties().put(config.PROPERTY_HANDLE_COOKIES, Boolean.TRUE);
		client = ApacheHttpClient.create(config);
		prop = ConfigProperties.getProperties();
		refreshAndInitialize();
	}

	public void refreshAndInitialize() {
		hsm = getHSMInfo();
		
		//now we take 1st library & 1st drive
		for(Library lib : hsm.getLibraries()){
			library = lib;
			break;
		}
		if(null == library){
			throw new IllegalStateException("no library defined in hsm");
		}
		for(Drive dr : library.getDrives()){
			drive = dr;
			break;
		}
		if(null == drive){
			throw new IllegalStateException("no drive defined in library");
		}
		
		cachedLatency = 1;
		positioningLatency = drive.getAveragePositionTime();
		loadTapeLatency = drive.getAverageLoadTime();
		unloadTapeLatency = drive.getAverageUnloadTime();
		systemTransferRate = drive.getAverageDriveReadTransferRate();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public HSMFile getHSMFile(String fileName){
		WebResource webRes = client.resource(prop.getProperty(HSM_FILE_URL));
		MultivaluedMap queryParams = new MultivaluedMapImpl();
		queryParams.add("filename", fileName);
		String restResult = (String) webRes.queryParams(queryParams).get(String.class);
		return transformer.fromJson(restResult, HSMFileWrapper.class).hsmFile;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public HSM getHSMInfo() {
		WebResource webRes = client.resource(prop.getProperty(HSM_URL));
		MultivaluedMap queryParams = new MultivaluedMapImpl();
		return transformer.fromJson(webRes.queryParams(queryParams).get(String.class), HSMWrapper.class).hsm;
	}
	
	public boolean isTapeDrive(String tapeId){
		for(Drive d: library.getDrives()){
    		if(tapeId.equals(d.getTapeID())){
    			return true;
    		}
    	}
		return false;
	}
	
    public float getSystemTransferRate() {
        return systemTransferRate;
    }

    public int getFileQueueSize() {
    	if(null == filesInAQueue) getFilesInAQueue();
    	if(null == filesInAQueue || 0 == filesInAQueue.length) return 0;
        return filesInAQueue.length;
    }

    public HSMFile[] getFilesInAQueue() {
    	return filesInAQueue;
    }

    public boolean areThereAnyEmptyDrives() {
    	for(Drive d: library.getDrives()){
    		if(null == d.getTapeID() || "".equals(d.getTapeID())){
    			return true;
    		}
    	}
    	return false;
    }


    public float getCachedLatency() {
        return cachedLatency;
    }


    public float getPositioningLatency() {
        return positioningLatency;
    }

    public float getLoadTapeLatency() {
        return loadTapeLatency;
    }

    public float getUnloadTapeLatency() {
        return unloadTapeLatency;
    }
    
    //TODO
	public String getBlockSize(int tapeId) {
		return "0";
	}
}
