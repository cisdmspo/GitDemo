package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {

	//Will execute after all "Personal Loan" (folder) tests
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last");//automation code
	}


	@Test
	public void Demo()
	{
		System.out.println("hello");//automation code
		//force the test to fail
		Assert.assertTrue(false);
	}

	//will execute after all tests in the xml
	@AfterSuite
	public void afSuite()
	{
		System.out.println("I am the last");
	}
	
	@Test
	public void SecondTest()
	{
		System.out.println("bye");
	}
}
