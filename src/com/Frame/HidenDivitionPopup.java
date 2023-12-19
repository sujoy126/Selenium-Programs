package com.Frame;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HidenDivitionPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SUJOY_Qspider\\SELENIUM_WORK\\SELENIUM_QSP\\SERVER\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin", Keys.TAB, "manager", Keys.ENTER);
		
		driver.findElement(By.id("container_tasks")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='checkbox inactive']/div")).click();
		Thread.sleep(3000);
		WebElement we= driver.findElement(By.xpath("//div[text()='Delete']"));
		we.click(); 
		  
		  String s= we.getText();
		  System.out.println(s);
	}

}
