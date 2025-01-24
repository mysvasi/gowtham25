package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_SoftAssert {
  
	@Test(priority = 0) 
	public void softAssert() {		
		SoftAssert sa = new SoftAssert();
		System.out.println("Soft assertion started from here"); 
		sa.assertTrue(false); //// Test case failed here but next statement will be executed. 
		System.out.println("Soft assertion ended here"); 
		sa.assertAll();
	}
	
	@Test(priority = 1) 
	public void HardAssert() {		
		System.out.println("Hard assertion started from here"); 
		Assert.assertTrue(false); //// Test case failed here but next statement will be executed. 
		System.out.println("Hard assertion ended here"); 		
	}
	
	
}
