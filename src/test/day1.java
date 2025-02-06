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
		System.out.println("change code");//automation code
		System.out.println("change code2");//automation code
		System.out.println("change code3 from user 1");//automation code
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
