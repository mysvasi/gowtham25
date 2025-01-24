package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsOrder {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before suite method called");
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("after suite method called");
	}

	@BeforeTest
	public void beforetest() {
		System.out.println("Before test method called");
	}

	@AfterTest
	public void aftertest() {
		System.out.println("after test method called");

	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("Before class method called");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("after class method called");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before method  called");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("after method  called");
	}
	
	@Test
	public void f() {
		System.out.println("f method called");
	}

	@Test
	public void f1() {
		System.out.println("f1 method called");

	}

	@Test
	public void f2() {
		System.out.println("f2 method called");

	}

	@Test
	public void f3() {
		System.out.println("f3 method called");

	}

	@Test
	public void f4() {
		System.out.println("f4 method called");

	}
}
