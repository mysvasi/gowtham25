package TestNG;

import org.testng.annotations.Test;

public class GroupingTestMethods {

	@Test(groups = {"Car" ,"Regression"})
	public void mahindra() {
		System.out.println("CAR1 : Mahindra");
	}
	@Test(groups = {"Sanity"})
	public void sedan() {
		System.out.println("Seadan CAR");
	}
	@Test(groups = {"Car","Smoke"})
	public void Bajaj() {
		System.out.println("CAR2 : Bajaj");
	}
}
