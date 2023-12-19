package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_1_isSelected {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.actitime.com/login.do");
		
		WebElement we =  driver.findElement(By.name("remember"));
		we.click();
		
		boolean status = we.isSelected();
		if(status)
		{
			System.out.println("checkbox is selected");
		}
		else
		{
			System.out.println("checkbox is not selected");
		}
		
	}

}
