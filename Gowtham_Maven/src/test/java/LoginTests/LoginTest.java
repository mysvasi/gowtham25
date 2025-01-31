package LoginTests;

import java.io.IOException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Pages.DashboardPage;
import Pages.LoginPage;

public class LoginTest extends LoginPage {

	LoginPage loginpage;
	DashboardPage dashboardpage;

	public LoginTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void Setup() throws IOException {
		initialization();
		loginpage = new LoginPage();
	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = loginpage.validateLoginPageTitle();
		System.out.println(title);
	}

	@Test
	public void HRMLogin() throws IOException {
		dashboardpage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
