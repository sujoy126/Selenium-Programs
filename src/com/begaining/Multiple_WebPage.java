package com.begaining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_WebPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.geckdriver", "D:\\SUJOY_Qspider\\SELENIUM_WORK\\SELENIUM_QSP\\SERVER\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(3000);
		driver.get("https://chat.openai.com/");
	}

}
