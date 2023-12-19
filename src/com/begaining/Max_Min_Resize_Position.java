package com.begaining;

//import java.awt.Point;
import org.openqa.selenium.Point;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Max_Min_Resize_Position {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\SUJOY_Qspider\\SELENIUM_WORK\\SELENIUM_QSP\\SERVER\\chromedriver.exe" );
		 ChromeDriver driver= new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 
		 driver.manage().window().minimize();
		 
		 Dimension dm = new Dimension(400, 500); 
		 driver.manage().window().setSize(dm);
		 
		 Point p=new Point(200, 100);
		 driver.manage().window().setPosition(p);
		 
		 
	}

}
