package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	@BeforeClass
	public void beforeClass()
	{
		
		System.out.println("Before executing any methods in the class day 3");
	}
	
	@Parameters({"URL"})
	@Test
	public void WebloginCarLoan(String urlname)
	{
		System.out.println("Web login car");
		System.out.println(urlname);
	}
	
	@BeforeMethod
	public void beforeEvery()
	{
		System.out.println("I will execute before every test method in the day 3 class");
	}
	
	@AfterMethod
	public void afterEvery()
	{
		System.out.println("I will execute after every test method in the day 3 class");
	}
	
	@AfterClass
	public void afterClass()
	{
		
		System.out.println("After executing any methods in the class day 3");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLogincarLoan()
	{
		System.out.println("Mobile login car");
	}
	
	@BeforeSuite
	public void BSuite() 
	{
		System.out.println("I will execute before any test is executed");
	}
	@Test(enabled = false)
	public void MobileSignInincarLoan()
	{
		System.out.println("Mobile Sign in car");
	}
	
	@Test(dataProvider = "getData")
	public void MobileSignOutincarLoan(String Username, String Password)
	{
		System.out.println("Mobile Sign Out car");
		System.out.println(Username);
		System.out.println(Password);
	}
	
	@Test(dependsOnMethods = {"WebloginCarLoan"})
	public void APILogincarLoan()
	{
		System.out.println("API login car");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		data[0][0] = "firstUsername";
		data[0][1] = "firstPassword";
		data[1][0] = "secondUsername";
		data[1][1] = "secondPassword";
		data[2][0] = "thirdUsername";
		data[2][1] = "thirdPassword";
		return data;
		
		
	}


}
