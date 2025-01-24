package Selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_JSHorizontalScroll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Driver initialization
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://selenium08.blogspot.com/2020/02/horizontal-scroll.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Work']"));

		// Create the JavascriptExecutor interface object by type casting of WebDriver instance.
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Call scrollIntoView() method of Javascript using arguments[0].
		js.executeScript("arguments[0].scrollIntoView();", element);
		
		
		
	}

}
