package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_MoveCarser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SUJOY_Qspider\\SELENIUM_WORK\\SELENIUM_QSP\\SERVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.swiggy.com/");
		
		
		WebElement we = driver.findElement(By.xpath("//a[text()='Login']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(we).perform();
	
	}

}
