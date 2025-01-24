package Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_ReadDropdownValues {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Driver initialization
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://selenium08.blogspot.com/2019/11/dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='Month']")); 
		Select select = new Select(dropdown);
		
		 // Call getOptions() method of select class to get all options available in the list. 
	    List<WebElement> getOptions = select.getOptions(); 
	 // Create a list of generic type String to add all dropdown options in the list. 
	    
	    List<String> list =new ArrayList<String>();
 
	     for(WebElement element : getOptions) {
	    	 list.add(element.getText());
	     }     
	     System.out.println("Options are: " + list);
	     select.selectByVisibleText(list.get(8));
	     
	     
	     //Reading values and send to select methods 
	     List<String> list1 =new ArrayList<String>();
	     for (int i = 0; i < getOptions.size(); i++ )
	     {
	    	 list1.add(getOptions.get(i).getText());
	     }
	     System.out.println("Options are: " + list1);
	     
	 	select.selectByVisibleText(list.get(10));

	}
	
	
	
	

}
