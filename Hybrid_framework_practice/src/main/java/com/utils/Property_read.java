package com.utils;

import java.io.FileInputStream;

import java.util.Properties;

public class Property_read {
	
	public static String readProperty(String key) throws Exception {
		 Properties pro= new Properties();
		 FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/config.properties");
		 pro.load(fis);
		
		 return pro.getProperty(key);
	}
	
	
	

}
