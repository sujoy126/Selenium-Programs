package com.Dropdown;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameElement {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SUJOY_Qspider\\SELENIUM_WORK\\SELENIUM_QSP\\SERVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/overview-summary.html");

		
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//a[text()='Frames']")).click();
		 
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();

		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//span[text()='Alert']")).click();

		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		WebElement we = driver.findElement(By.cssSelector("h2[title='Interface Alert']"));
		System.out.println(we.getText());

	}

}
