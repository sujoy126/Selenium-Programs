package com.section_2;



import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon_DynamicDropDown {
	public static void main(String[] args) throws Throwable {
	//	WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "D:\\SUJOY_Qspider\\SELENIUM_WORK\\SELENIUM_QSP\\SERVER\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes for men");
		Thread.sleep(3000);
		
		List<WebElement> we= driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		List<String> l = new ArrayList<String>();
		
		for(WebElement e: we)
		{
			l.add(e.getText());
		}
		for(String s: l)
		{
			System.out.println(s);
		}
		
		
	}

}
