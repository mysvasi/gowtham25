package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_WebDrivemanager {

	public static void main(String[] args) throws InterruptedException {
		      //System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
				//WebDriverManager.chromedriver().setup();
				WebDriverManager.chromedriver().browserVersion("129.0.6668.70");
				WebDriverManager.firefoxdriver().setup();
				WebDriver driver = new FirefoxDriver();
				//WebDriver driver = new ChromeDriver(); // Driver initialization
				driver.manage().window().maximize();
				driver.get("https://opensource-demo.orangehrmlive.com");
				Thread.sleep(3000);
				//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
				driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
				driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				driver.quit();


	}

}
