package Selenium;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

public class TC_TakeScreenshot {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String title = driver.getTitle();
		System.out.println("Title Name" + title);
		Thread.sleep(3000);
        takescreenshot("Login");
		// Taking Screenshot
		/*
		 * File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); File f2
		 * = new File("C:\\selenium\\screesnhot\\Login.jpg"); Files.copy(f1, f2);
		 */
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		takescreenshot("Dashboard");	
		String home = driver.getTitle();
		System.out.println("Home page" + home);

	}

	public static void takescreenshot(String filename) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// now copy the screenshot to desired location using copyFile //method
		Files.copy(src, new File("\\Gowtham_sel\\src\\img\\" + filename + ".png"));
	}

}
