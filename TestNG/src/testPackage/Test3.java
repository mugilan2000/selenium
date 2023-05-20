package testPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Test3 {

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("-----------------------------------");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("-----------------------------------");
	}
	@Parameters({"username"})
	@Test
	public void greeting2(String uname)
	{
		System.out.println("Have a wonderful day");
		System.out.println("My username is "+uname);
	}
	@Test(dataProvider = "getData")
	public void greeting3(String username, String password)
	{
		
		System.out.println(username);
		System.out.println(password);
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("I will execute before Test");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("I will execute after Test");
	}
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("I will execute before suite");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("I will execute after suite");
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		data[0][0] = "FirstUsername";
		data[0][1] = "FirstPassword";
		data[1][0] = "SecondUsername";
		data[1][1] = "SecondPassword";
		data[2][0] = "ThirdUsername";
		data[2][1] = "ThirdPassword";
		
		return data;
	}

}
