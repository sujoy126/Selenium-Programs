package com.MouseActions;

import java.io.File;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class MoveCarserWithScreenShot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\SUJOY_Qspider\\SELENIUM_WORK\\SELENIUM_QSP\\SERVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.myntra.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
			
			Actions act = new Actions(driver);	
			WebElement we1= driver.findElement(By.xpath("//a[text()='Beauty']"));
			WebElement we2 = driver.findElement(By.xpath("//a[text()='Eye Cream']"));
			
			
			act.moveToElement(we1).moveToElement(we2).perform();
			
			
			TakesScreenshot ts= (TakesScreenshot) driver;
			File sur  = ts.getScreenshotAs(OutputType.FILE);
			File desc = new File("D:\\\\SUJOY_Qspider\\\\SELENIUM_WORK\\\\ScreenShot\\\\P3.jpg");
			Files.copy(sur, desc);
	}

}
