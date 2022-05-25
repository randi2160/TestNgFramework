package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	
	@BeforeSuite
	public void BeforeSuites()
	{
		
		System.out.println("this is before suite run i am priority");
		System.out.println("RUN ME FIRST AS PART OF SUITE");
	}
	
	@Test
	public void Demo()
	{
		
		System.out.println("day2");
	}
	@BeforeTest
	public void suitesetup()
	{
		System.out.println("before running day 2 i am at setup");
		System.out.println("i will delete the folder");
		System.out.println("i will truncate the table etc");
		
	}
	
	@Test(groups="smoke")
	public void Demo2()
	{
		
		System.out.println("day2 demo 2");
	}
	@Test
	public void personal_car_loan()
	{
		
		System.out.println("personal car loan");
	}
	
	@Test(groups="smoke")
	public void personal_home_loan()
	{
		
		System.out.println("personal home loan");
	}
}
