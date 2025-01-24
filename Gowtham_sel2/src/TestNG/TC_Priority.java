package TestNG;

import org.testng.annotations.Test;

public class TC_Priority {
	
	@Test (priority = 1)
	public void method1() {
		System.out.println("Method 1");
	}

	@Test (priority = 2)
	public void amethod2() {
		System.out.println("Method 2");
	}

}
