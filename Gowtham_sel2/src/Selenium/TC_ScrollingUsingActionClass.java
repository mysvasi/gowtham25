package Selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;

public class TC_ScrollingUsingActionClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Driver initialization
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Actions ac = new Actions(driver);
		//ac.scrollByAmount(0, 800).perform();
		//ac.scrollByAmount(0, -800).perform();
			
       // WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromViewport(10, 10);
       // ac.scrollFromOrigin(null, 0, 800).perform();
		
        WebElement linktext = driver.findElement(By.xpath("//a[@class='icon-pencil']"));
        ac.scrollToElement(linktext).perform();

	}

}
