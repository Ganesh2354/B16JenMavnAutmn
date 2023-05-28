package com.fb.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataReader {
	Properties prop;
	public ConfigDataReader()
	{		
		String path="C:\\Users\\Ganesh Dandekar\\eclipse-workspace\\"
				+ "B16E_Framework\\ConfigData\\configProperties";		
		File file=new File(path);	
		try {
		FileInputStream fis=new FileInputStream(file);	
		prop=new Properties();
		prop.load(fis);		
		}catch(Exception e)
		{
			System.out.println("File Not Found");
		}		
	}
	public String getConfigValue(String configKey)
	{
		return prop.getProperty(configKey);
	}
	public String getURL()
	{
		return prop.getProperty("TestEnvironmentURL");
	}
	public String getEmailOrMobile()
	{
		return prop.getProperty("EmailorMobile");
	}
	public String getPassword()
	{
		return prop.getProperty("password");
	}
}
