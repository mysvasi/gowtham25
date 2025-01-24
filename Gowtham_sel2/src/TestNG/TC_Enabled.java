package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_Enabled {

	@Test (description = "Method1")
	public void method1() {
		System.out.println("Method 1");		
	}
	@Test(enabled = false)
	public void method2() {
		System.out.println("Method 2");
	}

}
