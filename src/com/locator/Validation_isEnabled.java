package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_isEnabled {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");

	    
	    driver.findElement(By.xpath("//div[text()='Login ']")).click();
	    Thread.sleep(4000);
	    WebElement we = driver.findElement(By.xpath("//span[@class='errormsg'][1]"));
	    if(we.isEnabled()==false)
	    {
	    	System.out.println("Attribute is Enabled");
	    	
	    }
	    else
	    {
	    	System.out.println("Atribute is disabled");
	    }
		
		
	}

}
