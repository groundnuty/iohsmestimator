package pl.edu.agh.abd.estimator;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLEncoder;
import javax.ws.rs.core.MultivaluedMap;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.client.apache.ApacheHttpClient;
import com.sun.jersey.client.apache.config.DefaultApacheHttpClientConfig;
import com.sun.jersey.core.util.MultivaluedMapImpl;

import pl.edu.agh.abd.ConfigProperties;
import pl.edu.agh.storage.estimation.hsmclient.*;

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

    private String hsmId ;

	@SuppressWarnings("static-access")
	public HSMMonitoringStub(String hsmId){
		transformer = new Gson();
		DefaultApacheHttpClientConfig config = new DefaultApacheHttpClientConfig();
		config.getProperties().put(config.PROPERTY_HANDLE_COOKIES, Boolean.TRUE);
		client = ApacheHttpClient.create(config);
		prop = ConfigProperties.getProperties();
                this.hsmId = encode(hsmId);
		refreshAndInitialize();
	}

	public void refreshAndInitialize() {
		hsm = getHSMInfo();
		
		//now we take 1st library & 1st drive
        library = hsm.getLibraries();
		/*for(Library lib : hsm.getLibraries()){
			library = lib;
			break;
		} */
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

    private String getHSMFileUrl(String fileName) {
        return prop.getProperty(HSM_FILE_URL)+this.hsmId ;
    }

     private String getHSMUrl() {
        return prop.getProperty(HSM_URL)+this.hsmId ;
    }

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public HSMFile getHSMFile(String fileName){
		WebResource webRes = client.resource(getHSMFileUrl(fileName));
		MultivaluedMap queryParams = new MultivaluedMapImpl();
		queryParams.add("filename", fileName);
		String restResult = (String) webRes.queryParams(queryParams).get(String.class);

		return transformer.fromJson(restResult, HSMFileWrapper.class).hsmFile;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public HSM getHSMInfo() {
		WebResource webRes = client.resource(getHSMUrl());
		MultivaluedMap queryParams = new MultivaluedMapImpl();
        WebResource b = webRes.queryParams(queryParams) ;
        String a = b.get(String.class) ;

        return transformer.fromJson(a, HSMWrapper.class).hsm;
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
	public int getBlockSize(String tapeId) {
        for(Tape t: library.getTapes()) {
            if(t.getTapeID().equals(tapeId)) {
                return t.getBlockSize() ;
            }
        }
		return 1 ;
	}

    private static String encode(String url) {
        try {
            return URLEncoder.encode(url, "utf-8");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
