package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_JSClickandEnterValue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String title = driver.getTitle();
        System.out.println("Title Name" + title);
        Thread.sleep(3000);
        
        //Entering values in Textbox using JS
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement username = driver.findElement(By.name("username"));
        js.executeScript("arguments[0].value='Admin'",username);
        WebElement password = driver.findElement(By.name("password"));
        js.executeScript("arguments[0].value='admin123'",password);
        
        //Click on login buttin using JS
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        js.executeScript("arguments [0].click ();", login);
        String home = driver.getTitle();
        System.out.println("Home page" + home);
        //driver.quit();

	}

}
