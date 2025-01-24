package TestNG;

import org.testng.annotations.Test;

public class TC_InvocationCount {
  
	@Test (description = "Method1")
	public void method1() {
		System.out.println("Method 1");		
	}
	@Test(invocationCount = 3)
	public void method2() {
		System.out.println("Method 2");
	}

	
}
