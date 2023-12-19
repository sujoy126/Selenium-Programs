package com.Dropdown;

import java.time.Duration;

 

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm_MultipleDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SUJOY_Qspider\\SELENIUM_WORK\\SELENIUM_QSP\\SERVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement we1 =driver.findElement(By.name("username"));
		we1.sendKeys("Admin", Keys.TAB, "admin123", Keys.ENTER);
		
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[2]")).click();
		
		WebElement we2=  driver.findElement(By.cssSelector("input[placeholder='Type for hints...']"));
	
		we2.sendKeys("AnthonyJoshuva John",Keys.TAB, "123456", Keys.TAB, Keys.DOWN, Keys.DOWN, Keys.DOWN,
				Keys.ENTER, Keys.TAB, Keys.DOWN, Keys.ENTER, Keys.TAB, "Charlie  Carter", Keys.DOWN, Keys.ENTER,
				Keys.TAB, Keys.DOWN, Keys.DOWN, Keys.ENTER, Keys.TAB, Keys.DOWN, Keys.DOWN,Keys.DOWN, Keys.ENTER,
				Keys.TAB, Keys.TAB, Keys.ENTER);
		
	}

}