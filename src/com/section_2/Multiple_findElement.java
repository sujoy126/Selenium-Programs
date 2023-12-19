package com.section_2;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_findElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.className("gLFyf")).sendKeys("chatgbt");
		Thread.sleep(2000);
		
		List<WebElement> we = driver.findElements(By.xpath("//div[@class='erkvQe']/div/ul/li"));
		
		for(WebElement e : we)
		{
			String s= e.getText();
			System.out.println(s);
		}
	}

}
