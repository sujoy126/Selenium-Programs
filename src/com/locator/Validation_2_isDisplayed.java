package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_2_isDisplayed {
	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		WebElement we = driver.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']"));
		boolean status= we.isDisplayed();
		
		if(status==true)
		{
			System.out.println("incurrect userid & password");
			String st= we.getText();
			System.out.println(st);
			
		}
		else
		{
			System.out.println("home page is displayed");
		}
	//	WebDriver driver1;
	//	driver1.close();
		
		
	//	WebElement we1;
	//	WebElement we2;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
