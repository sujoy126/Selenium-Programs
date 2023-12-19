package com.Frame;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Popup {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
		
		Calendar ca = Calendar.getInstance();
		ca.add(Calendar.DAY_OF_YEAR, 1);
		Date da = ca.getTime();
		System.out.println(da);
		
		SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/YYYY");
		
		
	}

}
