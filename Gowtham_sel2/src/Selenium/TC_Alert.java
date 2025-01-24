package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		String title = driver.getTitle();
		System.out.println("Title Name" + title);
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'alert box:')]")).click();
		Thread.sleep(2000);
		//Alert Interface
         Alert alert = driver.switchTo().alert();
         alert.accept();
         //Alert Dismiss
 		driver.findElement(By.partialLinkText("Alert with OK & Canc")).click();
		driver.findElement(By.xpath("//button[normalize-space()='click the button to display a confirm box']")).click();
		Thread.sleep(2000);
		alert.dismiss();
		//Alert send text
		driver.findElement(By.partialLinkText("Alert with Textb")).click();
		WebElement alertbox = driver.findElement(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']"));
		System.out.println(alertbox);
		alertbox.click();
		Thread.sleep(3000);
		System.out.println("Before" + alert.getText());
		alert.sendKeys("Test  automation");
		Thread.sleep(4000);
		System.out.println("after" + alert.getText());
		alert.accept();
		driver.quit();
	}

}
