package com.Frame;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_TwoDifferentTab {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SUJOY_Qspider\\SELENIUM_WORK\\SELENIUM_QSP\\SERVER\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.swiggy.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.myntra.com/");
		
	//	System.out.println(driver.getTitle());
		
		String mainId= driver.getWindowHandle();
		Set<String> allId = driver.getWindowHandles();
		for(String s : allId)
		{
			if(!s.equals(mainId));
			{
				driver.switchTo().window(s);
			}
		}
			
		
	}

}
