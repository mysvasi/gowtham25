package Selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_FindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.geeksforgeeks.org/");
		String title = driver.getTitle();
		System.out.println("Title Name" + title);
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));		
		for(WebElement link : allLinks) {
			System.out.println(link.getText());		
	}
	 driver.quit();
	}
}
