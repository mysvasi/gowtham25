package Base;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;	
	public static Properties prop ;	
	
	public TestBase() throws IOException {
		
		prop = new Properties();
		FileReader file = new FileReader("C:\\Users\\Vasantha.Kumar\\git\\gowtham_maven\\Gowtham_Maven\\src\\main\\resources\\config.properties");
		//Property object with method load		
		prop.load(file);			
	}

	public static void initialization() {		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

	}

}
