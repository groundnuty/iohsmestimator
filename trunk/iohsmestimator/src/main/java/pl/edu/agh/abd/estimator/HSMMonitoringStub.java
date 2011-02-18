package pl.edu.agh.abd.estimator;



import javax.ws.rs.core.MultivaluedMap;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.client.apache.ApacheHttpClient;
import com.sun.jersey.client.apache.config.DefaultApacheHttpClientConfig;
import com.sun.jersey.core.util.MultivaluedMapImpl;

import pl.edu.agh.abd.ConfigProperties;
import pl.edu.agh.abd.estimator.mocks.HSMFileInfo;
import pl.edu.agh.storage.estimation.hsmclient.HSM;
import pl.edu.agh.storage.estimation.hsmclient.HSMFile;
import pl.edu.agh.storage.estimation.hsmclient.HSMFileWrapper;
import pl.edu.agh.storage.estimation.hsmclient.HSMWrapper;
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
	private float positioningLatency;
	private float loadTapeLatency;
	private float unloadTapeLatency;
	private HSMFileInfo[] filesInAQueue;
	private float systemTransferRate;
	private HSM hsm;
	
	@SuppressWarnings("static-access")
	public HSMMonitoringStub(){
		transformer = new Gson();
		DefaultApacheHttpClientConfig config = new DefaultApacheHttpClientConfig();
		config.getProperties().put(config.PROPERTY_HANDLE_COOKIES, Boolean.TRUE);
		client = ApacheHttpClient.create(config);
		prop = ConfigProperties.getProperties();
		hsm = getHSMInfo();
		
		//TODO !!!!!
		//cachedLatency = transformer.fromJson(getFromServer(prop.getProperty(CACHED_LATENCY_URL), 0), Float.class);
		//positioningLatency = transformer.fromJson(getFromServer(prop.getProperty(POSITIONING_LATENCY_URL), 0), Float.class);
		//loadTapeLatency = transformer.fromJson(getFromServer(prop.getProperty(LOAD_TAPE_LATENCY_URL), 0), Float.class);
		//unloadTapeLatency = transformer.fromJson(getFromServer(prop.getProperty(UNLOAD_TAPE_LATENCY_URL), 0), Float.class);
		//systemTransferRate = transformer.fromJson(getFromServer(prop.getProperty(SYSTEM_TRANSFER_RATE_URL), 0), Float.class);
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
	
    public float getSystemTransferRate() {
        return systemTransferRate;
    }

    public int getFileQueueSize() {
    	if(null == filesInAQueue) getFilesInAQueue();
    	if(null == filesInAQueue || 0 == filesInAQueue.length) return 0;
        return filesInAQueue.length;
    }

    //TODO
    public HSMFileInfo[] getFilesInAQueue() {
    	//filesInAQueue = transformer.fromJson(getFromServer(prop.getProperty(FILES_IN_QUEUE_URL), 0), HSMFileInfo[].class);
    	return filesInAQueue;
    }

    //TODO
    public boolean areThereAnyEmptyDrives() {
    	//return transformer.fromJson(getFromServer(prop.getProperty(ANY_EMPTY_DRIVES_URL), 0), Boolean.class);
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
