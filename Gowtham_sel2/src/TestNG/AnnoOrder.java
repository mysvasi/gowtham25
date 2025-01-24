package TestNG;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class AnnoOrder {
	@BeforeSuite
	public void beforeSuite() {

		System.out.println("beforeSuite");
	}

	@BeforeClass
	public void beforeClass() {

		System.out.println("beforeClass");
	}

	@BeforeTest
	public void beforeTest() {

		System.out.println("beforeTest");
	}

	@BeforeMethod
	public void beforeMethod() {

		System.out.println("beforeMethod");
	}

	@Test
	public void testCase1() {
		System.out.println("testCase1");
	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("afterMethod");
	}

	@AfterTest
	public void afterTest() {

		System.out.println("afterTest");
	}

	@AfterClass
	public void afterClass() {

		System.out.println("afterClass");
	}

	@AfterSuite
	public void afterSuite() {

		System.out.println("afterSuite");
	}

}
