package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Id_Name {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", "D:\\SUJOY_Qspider\\SELENIUM_WORK\\SELENIUM_QSP\\SERVER\\geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement we1 = driver.findElement(By.name("username"));
		we1.sendKeys("Admin");
		WebElement we2 = driver.findElement(By.name("password"));
		we2.sendKeys("admin123");
		WebElement we3=driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"));
		we3.click();
	}
}
