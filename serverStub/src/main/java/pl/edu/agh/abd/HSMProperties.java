package pl.edu.agh.abd;

import java.io.IOException;
import java.util.Properties;

public class HSMProperties extends Properties {

	public static String POSITIONING_LATENCY = "positioning_latency";
	public static String LOAD_TAPE_LATENCY = "load_tape_latency";
	public static String UNLOAD_TAPE_LATENCY = "unload_tape_latency";
	public static String CACHED_LATENCY = "cached_latency";
	
	private static HSMProperties INSTANCE;

	public HSMProperties() {
		try {
			load(getClass().getResourceAsStream("/hsm.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static synchronized HSMProperties getProperties(){
		if(null == INSTANCE){
			try {
				INSTANCE = new HSMProperties();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return INSTANCE;
	}
}
