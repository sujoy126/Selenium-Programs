package com.Frame;



import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/nestedframes");
		
		WebElement we= driver.findElement(By.id("frame1"));
		driver.switchTo().frame(we).switchTo().frame(0);
		
		String s= driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
		System.out.println(s);
		
		
	}

}
