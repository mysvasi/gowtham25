package Selenium;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		//File reader
		FileReader file = new FileReader("D:\\Training\\Gowtham_sel\\src\\config.properties");
		//Property object with method load
		Properties props = new Properties();
		props.load(file);
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(props.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(props.getProperty("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(props.getProperty("password"));
		driver.findElement(By.xpath(props.getProperty("submit.xpath"))).click();
        driver.quit();
	}

}
