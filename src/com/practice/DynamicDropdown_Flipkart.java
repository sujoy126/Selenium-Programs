package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicDropdown_Flipkart {
	public static void main(String[] args) {
	//	System.setProperty("webdriver.chrome.driver", "D:\\\\SUJOY_Qspider\\\\SELENIUM_WORK\\\\SELENIUM_QSP\\\\SERVER\\\\chromedriver.exe");
		WebDriver dr = ChromeBrowserLaunchC.chromeBrowserLaunch();
		
		dr.get("https://www.flipkart.com/");
		try {
			dr.findElement(By.xpath("//span[text()='✕']")).click();
			
		} 
		catch (Exception e) {
			System.out.println("Exception handel");
		}
		
		dr.findElement(By.name("q")).sendKeys("samsung");
		List<WebElement> l = dr.findElements(By.xpath("//input[@name='q']/../../following-sibling::ul/li"));
		
		for(WebElement w: l)
		{
		  String s = w.getText();
		  System.out.println(s);
		}
		System.out.println(l.size());
	}
}
