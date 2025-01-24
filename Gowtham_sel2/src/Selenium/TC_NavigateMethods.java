package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_NavigateMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Driver initialization
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://selenium08.blogspot.com/2019/11/dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//div[@class='header-widget']//div//a[contains(text(),'Selenium')]")).click();
        driver.navigate().refresh();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().to("https://www.google.com/");
       // driver.quit();

	}

}
