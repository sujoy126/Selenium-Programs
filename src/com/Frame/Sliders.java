package com.Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/slider/");
		
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
	   // driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		
		Actions act =new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		act.dragAndDropBy(we, 300, 0).perform();
	}

}
