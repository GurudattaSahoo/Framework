package com.guruworks.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataprovider {
	public static Properties prop;

	public ConfigDataprovider() {

		File src = new File("./Config/config.properties");

		try 
		{
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		}
		catch (Exception e) 
		{
			System.out.println("Unable to load the config file " + e.getMessage());
		}
	}

	public String getDataFromConfig(String ketToSearch)
	{
		return prop.getProperty("ketToSearch");
	}
	
	public String getBrowser()
	{
		return prop.getProperty("browserName");
	}
	
	public String getUrl()
	{
		return prop.getProperty("appUrl");
	}

}
