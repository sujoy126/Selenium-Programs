package com.Frame;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SUJOY_Qspider\\SELENIUM_WORK\\SELENIUM_QSP\\SERVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin", Keys.TAB, "manager", Keys.ENTER);
		
		
		
		driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_settings ']/div/div")).click();
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		driver.findElement(By.id("name")).sendKeys("Selenuium");
		
		driver.findElement(By.cssSelector("input[type='button']")).click();
		
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.cssSelector("input[type='button']")).click();	
		
		Alert al= driver.switchTo().alert();
		 String s= al.getText();
		 System.out.println(s);
		 Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}
}
