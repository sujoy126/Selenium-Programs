package com.begaining;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {
	public static void main(String[] args) {
		System.setProperty("WebDriver.Firefoxdriver", "D:\\SUJOY_Qspider\\SELENIUM_WORK\\SELENIUM_QSP\\SERVER\\geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		String title =driver.getTitle();
		System.out.println(title);
		String str = driver.getCurrentUrl();
		System.out.println(str);
		
		driver.close();
		
	}

}
