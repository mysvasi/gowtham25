package Selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_iframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Driver initialization
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://demoqa.com/frames");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.switchTo().frame("frame1");
		WebElement name = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(name.getText());
		driver.quit();
	}

}
