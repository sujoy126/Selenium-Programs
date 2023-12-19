package com.Frame;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_multipleTab {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.zomato.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.youtube.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.swiggy.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.myntra.com/");
		
	   Set<String> allUrl = driver.getWindowHandles();
	   for(String s: allUrl)
	   {   
		   driver.switchTo().window(s);
		   String title = driver.getTitle();
		   
		   System.out.println(title);	   
		   
			  if(!title.contains("Amazon.com. Spend less. Smile more."))
			   { 
				  driver.close();
			   } 
		
	   } 
	   
	    
	}

}
