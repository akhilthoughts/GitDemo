package test;

import org.testng.annotations.Test;

public class Day4 {
	
	@Test
	public void WebloginHomeLoan()
	{
		System.out.println("Web login Home");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginHomeLoan()
	{
		System.out.println("Mobile login Home");
	}
	
	@Test(timeOut = 4000)
	public void LoginAPIHomeLoan() 
	{
		System.out.println("API login Home");
	}
}
