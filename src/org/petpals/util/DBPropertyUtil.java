package org.petpals.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class DBPropertyUtil {
	
	public static String getConnString(String propFileName)
	{
		String connString = null;
		Properties propsObject = new Properties();
		try(FileInputStream fis = new FileInputStream(propFileName))  
		{
				propsObject.load(fis);
				connString = propsObject.getProperty("db.url")+"?user="+propsObject.getProperty("db.username")+"&password="+propsObject.getProperty("db.password");
		}catch (IOException fnf) {
			fnf.printStackTrace();
			System.out.println("Error:  Not able to Properties from File");
		}
		return connString;
	}
	
	public static void main (String[] args) {
		System.out.println(getConnString("db.properties"));
	}

}
