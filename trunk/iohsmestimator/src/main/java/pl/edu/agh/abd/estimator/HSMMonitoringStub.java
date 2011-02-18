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
import pl.edu.agh.storage.estimation.hsmclient.HSMFile;
import pl.edu.agh.storage.estimation.hsmclient.HSMFileWrapper;
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
	
	@SuppressWarnings("static-access")
	public HSMMonitoringStub(){
		transformer = new Gson();
		DefaultApacheHttpClientConfig config = new DefaultApacheHttpClientConfig();
		config.getProperties().put(config.PROPERTY_HANDLE_COOKIES, Boolean.TRUE);
		client = ApacheHttpClient.create(config);
		prop = ConfigProperties.getProperties();
		
		cachedLatency = transformer.fromJson(getFromServer(prop.getProperty(CACHED_LATENCY_URL), 0), Float.class);
		positioningLatency = transformer.fromJson(getFromServer(prop.getProperty(POSITIONING_LATENCY_URL), 0), Float.class);
		loadTapeLatency = transformer.fromJson(getFromServer(prop.getProperty(LOAD_TAPE_LATENCY_URL), 0), Float.class);
		unloadTapeLatency = transformer.fromJson(getFromServer(prop.getProperty(UNLOAD_TAPE_LATENCY_URL), 0), Float.class);
		systemTransferRate = transformer.fromJson(getFromServer(prop.getProperty(SYSTEM_TRANSFER_RATE_URL), 0), Float.class);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String getFromServerBlockSize(Integer HSMID, Integer tapeId){
		WebResource webRes = client.resource(prop.getProperty(BLOCK_SIZE_URL));
		MultivaluedMap queryParams = new MultivaluedMapImpl();
		queryParams.add("id", HSMID.toString());
		queryParams.add("tapeId", tapeId.toString());
		return (String) webRes.queryParams(queryParams).get(String.class);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String getFromServer(String url, Integer HSMID){
		WebResource webRes = client.resource(url);
		MultivaluedMap queryParams = new MultivaluedMapImpl();
		queryParams.add("id", HSMID.toString());
		return (String) webRes.queryParams(queryParams).get(String.class);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public HSMFile getHSMFile(String fileName){
		WebResource webRes = client.resource(prop.getProperty(HSM_FILE_URL));
		MultivaluedMap queryParams = new MultivaluedMapImpl();
		queryParams.add("filename", fileName);
		String restResult = (String) webRes.queryParams(queryParams).get(String.class);
		return transformer.fromJson(restResult, HSMFileWrapper.class).hsmFile;
	}
	
    public float getSystemTransferRate() {
        return systemTransferRate;
    }

    public int getFileQueueSize() {
    	if(null == filesInAQueue) getFilesInAQueue();
    	if(null == filesInAQueue || 0 == filesInAQueue.length) return 0;
        return filesInAQueue.length;
    }

    public HSMFileInfo[] getFilesInAQueue() {
    	filesInAQueue = transformer.fromJson(getFromServer(prop.getProperty(FILES_IN_QUEUE_URL), 0), HSMFileInfo[].class);
    	return filesInAQueue;
    }

    public boolean areThereAnyEmptyDrives() {
        
    	return transformer.fromJson(getFromServer(prop.getProperty(ANY_EMPTY_DRIVES_URL), 0), Boolean.class);
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
    
	public String getBlockSize(int tapeId) {
		return transformer.fromJson(getFromServerBlockSize(0, tapeId), String.class);
	}
}
