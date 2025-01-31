package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {

	//Locators 
	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;

	// Initializing the Page Objects:
	public LoginPage() throws IOException{
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public DashboardPage login(String un, String pwd) throws IOException {
		username.sendKeys(un);
		password.sendKeys(pwd);
		submit.click();
		return new DashboardPage();

	}

}
