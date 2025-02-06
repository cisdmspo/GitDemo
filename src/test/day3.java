package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//By default tests will execute in alphabetical order

public class day3 {
@BeforeClass
public void beforeclass()
{
	System.out.println("-before executing any methods in the class");//automation code
}

	@Parameters({"URL","APIKey"})
	@Test
	public void webloginCarLoan(String urlname,String key)
	{
		//selenium login
		System.out.println("webloginCar");//automation code
		System.out.println("another BRANCH change");//automation code
		System.out.println(urlname);
		System.out.println(key);
	}
	
	//Before method will run before EACH test in day3 class
	@BeforeMethod
	public void beforeeverytest()
	{
		//Appium login
		System.out.println("**before each test method in day3 class");//automation code
	}
	
	@AfterMethod
	public void aftereverytest()
	{
		//Appium login
		System.out.println("**after each test method in day3 class");//automation code
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("-After executing all methods in the class");//automation code
	}
	
	@Test(groups={"Smoke"})
	public void MobileloginCarLoan()
	{
		//Appium login
		System.out.println("MobileloginCar");//automation code
	}
	
	//Will run before any test in the xml
	@BeforeSuite
	public void BFsuite()
	{
		System.out.println("I am no 1");//automation code
	}
	
	//Skip this test case
	@Test(enabled=false)
	public void MobilesigninCarLoan()
	{
		//Appium login
		System.out.println("MobilesinginCar");//automation code
	}
	
	//millisec. If test takes too long it will timeout
	@Test(timeOut=4000)
	public void MobilesignoutCarLoan()
	{
		//Appium login
		System.out.println("MobilesingoutCar");//automation code
	}
	
	@Test(dataProvider="getData")
	public void MobileDataTest(String username, String password)
	{
		System.out.println("!!Data Test");//automation code
		System.out.println(username);
		System.out.println(password);
	}
	
	
	//run this after webloginCarLoan() & MobilesignoutCarLoan()
	@Test(dependsOnMethods={"webloginCarLoan","MobilesignoutCarLoan"})
	public void APICarLoan()
	{
		//REST API automation
		System.out.println("APIloginCar");//automation code
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination - username1, password1 - good credit history
		//2nd combination - username2, password2 - no credit history
		//3rd combination - username3, password3 - fraudulent credit history
		Object[][] data= new Object[3][2];
		//1st set
		data[0][0]="username1";
		data[0][1]="password1";
		//2nd set
		data[1][0]="username2";
		data[1][1]="password2";
		//3rd set
		data[2][0]="username3";
		data[2][1]="password3";
		return data;
	}
}
