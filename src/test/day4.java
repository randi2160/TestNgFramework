package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	
	@AfterSuite
	public void AfterSuites()
	{
		
		System.out.println("Run me last");
		System.out.println("RUN ME last as part of suite");
	}
	@Parameters({"URL"})
	@Test
	public void WebLoginCarLoan(String url)
	{
		System.out.println("car loan web  login");
		System.out.println(url);
	}
	@Test(dataProvider="getData")
	public void ApiLoginCarLoan(String username, String password)
	{
		System.out.println("car loan api login"+ " " + "username" + " " + username  + " " + "password" + " " + password);
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
	@DataProvider
	public Object[][] getData()
	{
		//Row and column 
		
		Object[][] data = new Object[3][2];
		data[0][0] ="firstusername";// first index or row
		data[0][1] ="firstpassword";
		data[1][0] ="secondusername";// first index or row
		data[1][1] ="secondpassword";
		data[2][0] ="thirdusername";// first index or row
		data[2][1] ="thirdpassword";
		
		return data;
	}
	
	@Test(dependsOnMethods= {"khemWebLoginCarLoan"})
	public void apicarloan()
	{
		System.out.println("api car loan expect car loan web login to go first then this method will be called");
	}

}
