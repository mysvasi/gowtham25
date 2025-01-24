package Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_Wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(6000));
		Duration timeout = driver.manage().timeouts().getPageLoadTimeout();
		System.out.println(timeout);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String title = driver.getTitle();
		System.out.println("Title Name" + title);

		// PageloadTimeout
		// driver.manage().timeouts().pageLoadTimeout(30 ,TimeUnit.SECONDS);//Selenium
		// version 3 Syntax
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));//Selenium
		// version 4 Syntax

		// Implicit Wait
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Selenium
		// version 3 Syntax
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));// Selenium version 4 Syntax

		WebElement un = driver.findElement(By.name("username"));
		// Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(un));
		un.sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String home = driver.getTitle();
		System.out.println("Home page" + home);
		driver.quit();

	}

}
