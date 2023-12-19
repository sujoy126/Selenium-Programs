package com.section_2;

import java.io.File;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		
		TakesScreenshot sh = (TakesScreenshot) driver;
		
	    File src = sh.getScreenshotAs(OutputType.FILE);
	    File desc = new File("D:\\SUJOY_Qspider\\SELENIUM_WORK\\ScreenShot\\S1.png");
	    Files.copy(src, desc);
	    driver.findElement(By.xpath("asdf")).click();
	
	}

}
