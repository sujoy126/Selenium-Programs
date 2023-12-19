package com.practice;

import java.io.File;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotProg {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\SUJOY_Qspider\\SELENIUM_WORK\\SELENIUM_QSP\\SERVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sour1 =  ts.getScreenshotAs(OutputType.FILE);
		File desc = new File("D:\\SUJOY_Qspider\\SELENIUM_WORK\\ScreenShot\\P4.jpg");
		Files.copy(sour1, desc);
		
	}

}
