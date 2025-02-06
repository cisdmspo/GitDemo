package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

	@Parameters({"URL"})
	@Test
	public void webloginHomeLoan(String urlname)
	{
		//selenium login
		System.out.println("webloginHome");//automation code
		System.out.println(urlname);
	}
	
	@Test(groups={"Smoke"})
	public void MobileloginHomeLoan()
	{
		//Appium login
		System.out.println("MobileloginHome");//automation code
	}
	
	@Test
	public void loginAPIHomeLoan()
	{
		//REST API automation
		System.out.println("APIloginHome");//automation code
	}
	
}
