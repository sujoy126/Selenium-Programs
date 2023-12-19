package com.MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement we =  driver.findElement(By.className("gLFyf"));
		
		 we.sendKeys("alpha");
		 
		 Actions act = new Actions(driver);
		 act.doubleClick(we).perform();
	}

}
