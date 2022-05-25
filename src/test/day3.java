package test;

import org.testng.annotations.Test;

public class day3 {
	
	
	@Test(groups="regression")
	public void WebLoginHomeLoan()
	{
		System.out.println("day 3 home loan login");
	}
	@Test(groups="regression")
	public void ApiLoginHomeLoan()
	{
		System.out.println("day 3 home loan login");
	}
	@Test(groups="regression")
	public void MobileLoginHomeLoan()
	{
		System.out.println("day 3 home loan login");
	}
	
	@Test(enabled=false)
	public void MobileSigninHomeLoan()
	{
		System.out.println("day 3 MobileSigninHomeLoan should not show enabled false");
	}
	
	@Test(enabled=true)
	public void MobileSigninCarLoan()
	{
		System.out.println("day 3 MobileSigninCarLoan");
	}
	
	//testng helper attribute of timeout
	@Test(timeOut=4000)
	public void Mobile1()
	{
		System.out.println("day 3 mobile 1");
	}
	
	@Test
	public void Mobile12()
	{
		System.out.println("day 3 mobile 2");
	}

}
