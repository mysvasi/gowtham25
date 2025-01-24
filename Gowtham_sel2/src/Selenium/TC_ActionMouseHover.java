package Selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_ActionMouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Driver initialization
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement menu = driver.findElement(By.xpath("//a[@class='no_border'][normalize-space()='Free Ebooks']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(menu).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Free Machine Learning Ebooks']")).click();
		Thread.sleep(1000);
        driver.quit();
	}

}
