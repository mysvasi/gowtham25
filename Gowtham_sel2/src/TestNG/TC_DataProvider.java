package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TC_DataProvider {
 
	public static WebDriver driver;
	
	@BeforeTest
	public void initialize() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String title = driver.getTitle();
		System.out.println("Title Name" + title);
		Thread.sleep(3000);
	}
/*
	@DataProvider(name ="myData")
	public Object[][] logindata(){	
		Object[][] data = new Object[2][2];
		data[0][0] = "Admin";
		data[0][1] ="admin123";	
		data[1][0] = "Admin";
		data[1][1] ="admin123";	
		return data;
		
	} */
	@Test(dataProvider = "getData" ,dataProviderClass = DataProviderClass.class)
	public void Login(String Username ,String Password) throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String home = driver.getTitle();
		System.out.println("Home page" + home);
		Thread.sleep(2000);

	}

	@Test
	public void logout() {
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}
	
}
