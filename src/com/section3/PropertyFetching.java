package com.section3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFetching {
	public static void main(String[] args) throws Exception {
		// To get the path of file  
		FileInputStream fis = new FileInputStream("D:\\SUJOY_Qspider\\SELENIUM_WORK\\SELENIUM_QSP\\DataDrivenProgram.PROPERTIES");
		
		// Convert file into object
		Properties pobj = new Properties();
		
		// load the file of url
		pobj.load(fis);
		String urlData = pobj.getProperty("url");
		System.out.println(urlData);
		
		
		// load the file of user name
		 String unData = pobj.getProperty("un");
		 System.out.println(unData);
		 
		 // load the file of password
		 String pw = pobj.getProperty("pwd");
		 System.out.println(pw);
		
	}

}
