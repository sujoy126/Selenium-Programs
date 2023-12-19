package com.locator;

import java.util.Random;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\SUJOY_Qspider\\SELENIUM_WORK\\SELENIUM_QSP\\SERVER\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement we1 = driver.findElement(By.name("username"));
		we1.sendKeys("admin");
		WebElement we2 = driver.findElement(By.name("pwd"));
		we2.sendKeys("manager");
		driver.findElement(By.cssSelector("input[value='on']")).click();
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(3000);	
		driver.findElement(By.cssSelector("div[id='container_tasks']")).click();
		driver.findElement(By.cssSelector("div[class='title ellipsis']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[class='item createNewCustomer']")).click();
		
		Thread.sleep(3000);
		
		Random r = new Random();
		int num = r.nextInt(3000);
		
		driver.findElement(By.cssSelector("input[class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("Bondhu"+num);
		driver.findElement(By.cssSelector("textarea[placeholder='Enter Customer Description']")).sendKeys("who can understand you.");
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[class='components_button withPlusIcon']")).click();	
		driver.findElement(By.id("logoutLink")).click();
		
	}

}
