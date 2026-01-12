package com.practice.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	Properties prop= new Properties();
	String configFilePath=System.getProperty("user.dir")+"\\Config\\config.properties";
	
	
	public ConfigReader()
	{
		try
		{
			FileInputStream fis = new FileInputStream(configFilePath);
			prop.load(fis);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public String getBrowser()
	{
		String returnValue=null;
		try
		{
			returnValue=prop.getProperty("browser");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return returnValue;
	}

	public String getBaseURL()
	{
		String returnValue=null;
		try
		{
			returnValue=prop.getProperty("baseURL");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return returnValue;
	}
	
	public String getValueFromConfigFile(String configFileKey)
	{
		String returnValue=null;
		try
		{
			returnValue=prop.getProperty(configFileKey);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return returnValue;
	}
}
