package test;

import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day1 {

 
	@BeforeClass
	public void beforeclassexecution()
	{
		System.out.println("Before excuting any method in the class run me first");
		
	}
	
	
	@AfterTest
	public void lastexection()
	{
		System.out.println("this is the last thing executed since we have the anotation to do so");
		
	}
	@Test(groups="smoke")
	public void Demo()
	{
		
		System.out.println("hellow");
	}
	
	//Lets discuss BeforeMethod and AfterMethod
	@BeforeMethod
	public void BeforeMethodExecution()
	{
		
		System.out.println("Executing before every methond");
	}
	
	@AfterMethod
	public void AfterMethondExecution()
	{
		
		System.out.println("Executing After every methond");
	}
	
}
