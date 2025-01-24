package Selenium;

import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_iframe1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Driver initialization
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
		String windows = driver.getWindowHandle();
		System.out.println("Number of Windows : " + windows);
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.linkText("Visit W3Schools.com!")).click();	
		//It holds the number windowhandles
		ArrayList<String> windowHandles = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("No. of tabs "+ windowHandles.size());
		driver.switchTo().window(windowHandles.get(1));
		driver.findElement(By.xpath("//a[@title='CSS Tutorial'][normalize-space()='CSS']")).click();
        driver.quit();

	}

}
