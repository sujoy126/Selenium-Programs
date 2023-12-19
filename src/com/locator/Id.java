package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Id {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver", "D:\\SUJOY_Qspider\\SELENIUM_WORK\\SELENIUM_QSP\\SERVER\\msedgedriver.exe");
		EdgeDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demo.actitime.com/login.do");
		WebElement el1 = driver.findElement(By.id("username"));
		el1.sendKeys("admin");
		Thread.sleep(3000);
		WebElement el2= driver.findElement(By.name("pwd"));
		el2.sendKeys("manager");
		Thread.sleep(3000);
		WebElement el3= driver.findElement(By.id("keepLoggedInCheckBox"));
		el3.click();
		Thread.sleep(2000);
		WebElement el4= driver.findElement(By.id("loginButton"));
		el4.click();
		
	}

}
