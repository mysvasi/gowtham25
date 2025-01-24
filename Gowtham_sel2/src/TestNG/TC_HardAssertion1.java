package TestNG;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_HardAssertion1 {

	// Create WebDriver reference.
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		// Create an object of ChromeDriver.
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String URL = "https://www.google.com";
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void verify() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);		
		//Call assertEqals() method to verify the comparison between actual title and expected title. 
		Assert.assertEquals(actualTitle, "Google");
		System.out.println("matched Home Page title");
	}
	
	@Test
	public void verify2() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		//Call assertEqals() method to verify the comparison between actual title and expected title. 
		Assert.assertEquals(actualTitle, "Googooole" , "Match not found");
		System.out.println("matched Home Page title");
	}
	
	@AfterMethod 
	public void close()
	{ 
	   driver.quit(); 
	  } 


}
