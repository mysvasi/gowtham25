package Selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_WindowHandler {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Driver initialization
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://the-internet.herokuapp.com/windows");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		String tabs = driver.getWindowHandle();
        System.out.println(tabs);
		driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
		driver.switchTo().window(tabs);
		String curl = driver.getCurrentUrl();
        System.out.println(curl);
		String title = driver.getTitle();
        System.out.println(title);
        driver.quit();

	}

}
