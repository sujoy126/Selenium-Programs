package com.begaining;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Back_Forword_Refresh {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SUJOY_Qspider\\SELENIUM_WORK\\SELENIUM_QSP\\SERVER\\chromedriver.exe");
		 ChromeDriver driver=  new ChromeDriver();
		 driver.get("https://www.zomato.com/");
		 driver.manage().window().maximize();
		 
		 Navigation nav= driver.navigate();
		 Thread.sleep(3000);
		 nav.back();   // driver.navigate().back();
		 Thread.sleep(3000);
		 nav.forward();  // driver.navigate().forword();
		 Thread.sleep(3000);
		 nav.refresh();  // driver.navigate().refresh();
		 

	}

}
