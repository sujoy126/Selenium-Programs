package com.practice;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dynamic_Dropdown_Amazon {
	public static void main(String[] args) throws Throwable {
		WebDriver s = ChromeBrowserLaunchC.chromeBrowserLaunch();
		
		s.navigate().to("https://www.amazon.com/");
		s.findElement(By.id("twotabsearchtextbox")).sendKeys("shirts for men");
		Thread.sleep(3000);
		
		List<WebElement> l=  s.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		
		for(WebElement w: l)
		{
			String data = w.getText();
			System.out.println(data);
		}
	}

}
