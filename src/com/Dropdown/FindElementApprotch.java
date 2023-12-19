package com.Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementApprotch {
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/selenium/newtours/register.php");
		
		
		 WebElement ele = driver.findElement(By.name("country"));
		 ele.click();
		 WebElement ele1=  driver.findElement(By.xpath("//option[text()='INDIA']"));
		 ele1.click();
		 ele1.sendKeys(Keys.ESCAPE);
		
	}

}
