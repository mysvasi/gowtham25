package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_ParallelTest {
	public static WebDriver driver;

	@Test
	public void openFF() throws Exception {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com");
		Reporter.log("Opened HRMS application in" + "browser" + "Browser");
		Thread.sleep(5000);
	}

	@Parameters({ "browser" })
	@BeforeMethod
	public void setUp(String browser) {
		if (browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
			Reporter.log("Opened HRMS application in Firefox Browser");
		} else if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			Reporter.log("Opened HRMS application in Chrome Browser");
		}
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
