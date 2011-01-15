package pl.edu.agh.abd;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class ConfigProperties extends Properties {

	public static String KEY1 = "key1";
	public static String ESTIMATE_INTERVAL = "estimateInterval";
	public static String SERVER_URL = "serverUrl";
	public static String CACHED_LATENCY_URL = "cachedLatencyUrl";
	public static String POSITIONING_LATENCY_URL = "positioningLatencyUrl";
	public static String LOAD_TAPE_LATENCY_URL = "loadTapeLatencyUrl";
	public static String UNLOAD_TAPE_LATENCY_URL = "unloadTapeLatencyUrl";
	public static String FILES_IN_QUEUE_URL = "filesInQueueUrl";
	public static String SYSTEM_TRANSFER_RATE_URL = "systemTransferRateUrl";
	public static String ANY_EMPTY_DRIVES_URL = "anyEmptyDrivesUrl";
	
	
	private static ConfigProperties INSTANCE;
	
	
	private ConfigProperties() throws FileNotFoundException, IOException {
		super();
		System.out.println(new File(".").getAbsolutePath());
	
		load(getClass().getResourceAsStream("/config.properties"));
	}
	
	public static synchronized ConfigProperties getProperties(){
		if(null == INSTANCE){
			try {
				INSTANCE = new ConfigProperties();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return INSTANCE;
	}
}
