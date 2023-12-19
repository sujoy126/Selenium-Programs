package com.Frame;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Side {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://www.amazon.com/");
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
		Thread.sleep(3000);
		
		List<WebElement> s = driver.findElements(By.xpath("(//div[@id='hmenu-content']/ul/li)"));
		int  count=0;
		for(WebElement w: s)
		{
			if(count>=6 && count <10 ) 
			{
				
			String a = w.getText();
			System.out.println(a);
			}
			count++;
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
			
	}

}
