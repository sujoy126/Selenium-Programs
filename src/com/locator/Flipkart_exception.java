package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_exception {
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "D:\\\\SUJOY_Qspider\\\\SELENIUM_WORK\\\\SELENIUM_QSP\\\\SERVER\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		try {
			driver.findElement(By.xpath("//button[text()='✕']")).click();
		} catch (Exception e) {
			System.out.println("exception handel");
		}
		
		 WebElement we= driver.findElement(By.name("q"));
		 we.sendKeys("Iphone");
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
		 
		Thread.sleep(4000);
		WebElement we1 = driver.findElement(By.xpath("//div[contains(text(), 'APPLE iPhone ')]"));
		
		String ph [] = new String[28];
		for(int i=0; i<=ph.length; i++)
		{
			System.out.println(we1.getText());
		}
		
		
		
		System.out.println(we1.getText());
		we1.click();
		
		
	}

}
