package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
	@AfterTest
	public void lastExecution()
	{
		System.out.println("I will execute at the last after the test folder");
		System.out.println("Git tutorials");
	}
	
	@Parameters({"URL" ,"Username"})
	@Test
	public void Demo(String urlname, String Username)
	{
		System.out.println("hello");
		System.out.println(urlname);
		System.out.println(Username);
		System.out.println("Git tutorials");
	}
	
	@AfterSuite
	public void ASuite()
	{
		System.out.println("I will execute last after all test is executed");
		System.out.println("Git tutorials");
	}
	
	@Parameters({"URL"})
	@Test
	public void SecondTest(String urlname)
	{
		System.out.println("Second Test");
		System.out.println(urlname);
		System.out.println("Git tutorials");
	}

}
