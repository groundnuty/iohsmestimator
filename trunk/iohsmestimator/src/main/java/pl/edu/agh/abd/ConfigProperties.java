package pl.edu.agh.abd;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties extends Properties {

	private static final long serialVersionUID = 1L;
	
	public static String ESTIMATE_INTERVAL = "estimateInterval";
    public static String ESTIMATOR_URL = "estimatorURL";


	public static String HSM_FILE_URL = "hsmFileURL"; 
	public static String HSM_URL = "hsmURL";
	
	
	private static ConfigProperties INSTANCE;


	public ConfigProperties() throws FileNotFoundException, IOException {
		super();
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
