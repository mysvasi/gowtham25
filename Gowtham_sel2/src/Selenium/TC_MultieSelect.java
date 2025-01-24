package Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_MultieSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Driver initialization
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://selenium08.blogspot.com/2019/11/dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='Month']"));
		Select select = new Select(dropdown);

		// Verify that dropdown allows the multiple-choice list or not.
		if (select.isMultiple()) {
			System.out.println("Dropdown allows multiple-choice list");
		} else {
			System.out.println("Dropdown does not allow multiple-choice");
		}

		select.selectByVisibleText("July");
		select.selectByVisibleText("May");
		select.selectByVisibleText("March");

		// Print selected Options
		List<WebElement> getOptions = select.getAllSelectedOptions();
		// Create a list of generic type String to add all dropdown options in the list.
		List<String> list = new ArrayList<String>();
		for (WebElement element : getOptions) {
			list.add(element.getText());
		}
		System.out.println("Selected Options are: " + list);

		// Deselect
		// select.deselectAll();
		select.deselectByVisibleText("March");

		// Verify that the number of choices in the list selected.
		if (select.getAllSelectedOptions().size() == 3) {
			System.out.println("3 options have been chosen");
		} else {
			System.out.println("Code not worked");
		}
		driver.quit();
	}

}
