package Selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

		// Row Count Details
		int row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		System.out.println("Number of Rows = " + row);
		int rowcol = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td")).size();
		System.out.println("Number of Rowscolumns = " + rowcol);

		// To get Data from particular Cell
		String rowData = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[1]")).getText();
		System.out.println("Data of Row = " + rowData);

		for (int i = 2; i <= row; i++) {
			for (int j = 1; j <= rowcol; j++) {
				String data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td[" + j + "]")).getText();
				System.out.println("All Data in Rows = " + data + "\n");
				if (j == 3) {
					j = 1;
					break;
				}
			}

		}

		driver.quit();
	}

}
