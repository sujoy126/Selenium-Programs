package com.practice;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFetchingP1 {
	public static void main(String[] args) throws Throwable {
		// To get the path of file 
		FileInputStream fis = new FileInputStream("D:\\SUJOY_Qspider\\SELENIUM_WORK\\SELENIUM_QSP\\DataDrivenProgram.PROPERTIES");
		// to convert Property file into object
		Properties pobj = new Properties();
		// load the file
		pobj.load(fis);
		
		String data=  pobj.getProperty("actiUrl");
		System.out.println(data);	
		
		// after this portion it will not work in selenium.
		// u go to maven project.
		
		System.setProperty("webDriver.chrome.driver", "D:\\SUJOY_Qspider\\SELENIUM_WORK\\SELENIUM_QSP\\SERVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(data);
		
	    
	}

}
