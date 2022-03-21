package com.auto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class PropInitializer{
	
	
	public static FileInputStream file;
	public static Properties prop;
	public static Properties returnProp(String path) {
		try {
			file = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		prop = new Properties();
		try {
			prop.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}
	
	
	public static String returnValuefromProp(String dataProp) {
		return prop.getProperty(dataProp);
	}
}
