package test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test(groups= {"Smoke"})
	public void ploan()
	{
		System.out.println("Good");
		Assert.assertTrue(false);
	}
	
	@BeforeTest
	public void preRequisite()
	{
		System.out.println("I will execute first before the test folder");
	}

}
