package Selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Windowhandlers {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Driver initialization
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://demoqa.com/browser-windows");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
      
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		//driver.findElement(By.xpath("//button[@id='messageWindowButton']")).click();

		String MainWindow = driver.getWindowHandle();
		System.out.println("Main window handle is " + MainWindow);

		// Multiple windowhandles
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println("Child window handle is " + allwindows);
		Iterator<String> iterator = allwindows.iterator();

		while (iterator.hasNext()) {
			String ChildWindow = iterator.next();
			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				WebElement text = driver.findElement(By.id("sampleHeading"));
				System.out.println("Heading of child window is " + text.getText());
				driver.close();
			}

		}
		driver.switchTo().window(MainWindow);
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}

}
