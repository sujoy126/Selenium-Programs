package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollHandelingP  {
	public static void main(String[] args)  {
		WebDriver dr = ChromeBrowserLaunchC.chromeBrowserLaunch();
		dr.get("https://www.myntra.com/");
		
		 WebElement we = dr.findElement(By.xpath("(//h4[@class='text-banner-title' ])[4]"));
		
		JavascriptExecutor jse = (JavascriptExecutor) dr;
		jse.executeScript("arguments[0].scrollIntoView()",we );
		
		
	}

}
