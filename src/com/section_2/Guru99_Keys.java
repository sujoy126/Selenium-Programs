package com.section_2;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99_Keys {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SUJOY_Qspider\\SELENIUM_WORK\\SELENIUM_QSP\\SERVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/selenium/newtours/register.php");
		
		
		WebElement we = driver.findElement(By.name("firstName"));
		we.sendKeys("GABBAR", Keys.TAB, "SINGH", Keys.TAB, "1234567890",Keys.TAB, "mailw987@gmail.com", Keys.TAB, "hyderabad",
				     Keys.TAB, "secendrabad", Keys.TAB,"telengana", Keys.TAB, "713367",	Keys.TAB, Keys.ENTER, Keys.DOWN ,		
		             Keys.DOWN, Keys.DOWN, Keys.DOWN,Keys.DOWN, Keys.DOWN, Keys.ENTER, Keys.TAB, "gabbarisback",
		             Keys.TAB, "don'tangryme", Keys.TAB, "don'tangryme", Keys.TAB);
	}

}
