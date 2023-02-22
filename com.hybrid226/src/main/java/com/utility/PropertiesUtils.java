package com.utility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtils {
	
	public static String readProperty(String key)throws Exception{
		String path=System.getProperty("user.dir")+"/src/main/resources/config.properties";
		Properties prop= new Properties();
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		
		return prop.getProperty(key);
		
		
	}

}
