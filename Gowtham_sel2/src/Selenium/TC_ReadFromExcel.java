package Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_ReadFromExcel {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		FileInputStream fis = new FileInputStream("C:\\selenium\\test.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet2");
		System.out.println(sheet.getSheetName());
		System.out.println("LastRows" + sheet.getLastRowNum());
		if (sheet.getLastRowNum()!= -1) {
			System.out.println("Test Data found");
			XSSFCell username = sheet.getRow(1).getCell(0);
			String un = username.toString();
			XSSFCell password = sheet.getRow(1).getCell(1);
			String pwd = password.toString();
			System.out.println(username);
			System.out.println(password);
			WebDriver driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	        driver.quit();
		} else {
			System.out.println("No Test Data foound");
			System.exit(0);
		}
		
		workbook.close();
		

	}

}
