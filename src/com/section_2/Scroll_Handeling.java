package com.section_2;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Handeling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//	Thread.sleep(3000);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
	  WebElement ele =	driver.findElement(By.xpath("//img[@class='image-image undefined ']"));
	  jse.executeScript("arguments[0].scrollIntoView()",ele);
	}

}
