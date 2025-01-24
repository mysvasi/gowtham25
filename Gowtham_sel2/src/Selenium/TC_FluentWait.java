package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.netty.handler.timeout.TimeoutException;

public class TC_FluentWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.globalsqa.com");

		WebElement contactus1 = driver
				.findElement(By.xpath("//li[@id='menu-item-1561']//a[normalize-space()='Contact Us']"));

		// Fluentwait
		Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(40))
				.pollingEvery(Duration.ofSeconds(10)).ignoring(TimeoutException.class);
		wait.until(ExpectedConditions.elementToBeClickable(contactus1));
		contactus1.click();
		driver.quit();
	}

}
