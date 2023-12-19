package com.MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\SUJOY_Qspider\\\\SELENIUM_WORK\\\\SELENIUM_QSP\\\\SERVER\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
	   WebElement we= driver.findElement(By.xpath("//a[text()='Images']"));
	   
	   Actions act = new Actions(driver);
	   act.contextClick(we).perform();
	//   act.moveToElement(we).contextClick().build().perform();
         
	}

}
