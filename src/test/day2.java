package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups={"Smoke"})
	public void ploan()
	{
		System.out.println("good");//automation code
	}
	
	// Before running any test in "Test":"Personal Loan"
	// e.g. need to clean data before running test
	@BeforeTest
	public void prerequiste()
	{
		System.out.println("I will execute first");
	}
	
}
