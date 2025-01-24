package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
	
	public static void main(String[] args) {	
		OpenBrowser ob = new OpenBrowser();
		ob.OpenChrome();
		//ob.OpenFirefox();	      
	}
	public void OpenChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //driver.close();
        driver.quit();
		}
	public void OpenFirefox() {
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
		}
}
