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
