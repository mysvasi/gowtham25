package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_ParameterAnnotation {
	
	@Parameters({"first-name"})
	@Test
	public void parameter_Test(String firstname) {
		System.out.println("Inovaked from Parameter :  " + firstname);

	}
}
