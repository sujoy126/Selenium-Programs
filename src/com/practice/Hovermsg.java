package com.practice;

// Write a program for h-over massage on checkbox in actitime homepage  before login. 

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hovermsg {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SUJOY_Qspider\\SELENIUM_WORK\\SELENIUM_QSP\\SERVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement hover0 = driver.findElement(By.name("username"));
		hover0.sendKeys("admin");
	//  insider the inspection attribute value print like type class 
		String hov=  hover0.getAttribute("type"); 
		System.out.println(hov);
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		
		
		WebElement hover=  driver.findElement(By.cssSelector("input[type='checkbox']"));		
	//  before login checkbox hovermsg
		String hv = hover.getAttribute("title"); 
		System.out.println(hv);
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		WebElement questionmark = driver.findElement(By.className("contactSupportButtonPlaceholder"));
		String str = questionmark.getAttribute("title"); // not working properly
		System.out.println(str);
		questionmark.click();
		
	}

}
