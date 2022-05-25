package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day4 {
	
	@AfterSuite
	public void AfterSuites()
	{
		
		System.out.println("Run me last");
		System.out.println("RUN ME last as part of suite");
	}
	
	
	@Test
	public void WebLoginCarLoan()
	{
		System.out.println("car loan web  login");
	}
	@Test
	public void ApiLoginCarLoan()
	{
		System.out.println("car loan api login");
	}
	@Test
	public void MobileLoginCarLoan()
	{
		System.out.println("car loan  mobile login");
	}
	
	@Test
	public void khemWebLoginCarLoan()
	{
		System.out.println("khem car loan web  login");
	}
	
	
	
	@Test(dependsOnMethods= {"khemWebLoginCarLoan"})
	public void apicarloan()
	{
		System.out.println("api car loan expect car loan web login to go first then this method will be called");
	}

}
