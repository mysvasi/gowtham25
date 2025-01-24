package TestNG;

import org.testng.annotations.Test;

public class TC_Parallel1 {
 
	@Test 
	public void firstTest() 
	{ 
	  System.out.println("First test method in ClassOne"+" " +"Thread Id: " +Thread.currentThread().getId()); 
	} 
	@Test 
	public void secondTest() 
	{ 
	   System.out.println("Second test method in ClassOne"+ " " +"Thread Id: " +Thread.currentThread().getId()); 
	 } 
	} 
	
	

