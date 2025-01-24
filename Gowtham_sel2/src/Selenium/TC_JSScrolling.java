package Selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_JSScrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Driver initialization
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement linktext = driver.findElement(By.xpath("//a[@class='icon-pencil']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].scrollIntoView(true);",linktext);

		// To Scroll to the element
		// WebElement position =
		// driver.findElement(By.xpath("//h3[normalize-space()='Effects']"));
		// js.executeScript("arguments[0].scrollIntoView();",position);

		// To Scroll to bottom of the page
		// js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		// To Scroll based on pixels
		js.executeScript("window.scrollBy(0,550)", ""); // to move downward
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-550)", "");// to move upward
	}

}
