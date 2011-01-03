package pl.edu.agh.abd;

import org.junit.Test;

import junit.framework.TestCase;
import static pl.edu.agh.abd.ConfigProperties.*;


public class PropertiesTest  extends TestCase{
	
	ConfigProperties properties;
	
	@Test
	public void testLoad(){
		properties = ConfigProperties.getProperties();
		
		assertEquals(properties.get(KEY1), "url");
	}
	
	

}
