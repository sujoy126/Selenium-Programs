package com.MouseActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		try {
			driver.findElement(By.xpath("//button[text()='✕']")).click();
		} catch (Exception e) {
			System.out.println("Exception handeled");
		}

		WebElement we = driver.findElement(By.name("q"));
		we.sendKeys("iphone");
		// we.sendKeys(Keys.ENTER);

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Actions act = new Actions(driver);

		  Thread.sleep(3000);
		  WebElement we1 =
		  driver.findElement(By.xpath("//div[@class='_31Kbhn _28DFQy']")); 	
	   	  act.dragAndDropBy(we1, 50, 0).perform();
		 
		  Thread.sleep(3000);
		  WebElement we2 =
		  driver.findElement(By.xpath("//div[@class='_31Kbhn WC_zGJ']/div"));  
		  act.dragAndDropBy(we2, -50, 0).perform();

	}

}
