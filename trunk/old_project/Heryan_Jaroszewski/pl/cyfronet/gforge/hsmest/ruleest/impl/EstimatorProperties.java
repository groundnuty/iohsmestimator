package pl.cyfronet.gforge.hsmest.ruleest.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class EstimatorProperties<E,V> extends Properties {
	
	public EstimatorProperties(String propertiesPath) throws InvalidPropertiesFormatException, IOException{
		super();
		FileInputStream in = new FileInputStream(new File(propertiesPath));
		loadFromXML(in);
	}
	
	private static final long serialVersionUID = -6337323985480512017L;

}
