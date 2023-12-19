package exam;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSamsung {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SUJOY_Qspider\\SELENIUM_WORK\\SELENIUM_QSP\\SERVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung", Keys.ENTER);
		
		driver.findElement(By.xpath("//span[contains(text(),'SAMSUNG Galaxy A54 5G Dual SIM 256GB 8GB RAM 6.4\" 120Hz AMOLED, Octa-Core, 50MP Camera, 4G Volte (GSM Unloc')]")).click();
		
	}

}
