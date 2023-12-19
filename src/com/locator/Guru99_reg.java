package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99_reg {
	public static void main(String[] args)  {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("saiteja");
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("jakkula");
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("1234567890");
		driver.findElement(By.cssSelector("input[name='userName']")).sendKeys("aff12af@gmail.com");
		driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("14-10/A");
		driver.findElement(By.cssSelector("input[name='city']")).sendKeys("hyderabad");
		driver.findElement(By.cssSelector("input[name='state']")).sendKeys("Telengana");
		driver.findElement(By.cssSelector("input[name='postalCode']")).sendKeys("1234567");
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("aff12af@gmail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Password1");
		driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys("Password1");
		driver.findElement(By.cssSelector("input[name='submit']")).click();
		
	}

}
