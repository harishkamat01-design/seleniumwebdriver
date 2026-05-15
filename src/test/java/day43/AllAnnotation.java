package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotation 
{
	@Test(priority=1)
	void abc()
	{
		System.out.println("method abc");
	}
	
	@Test(priority=2)
	void pqr()
	{
		System.out.println("Method pqr");
	}
	
	@Test(priority=3)
	void xyz()
	{
		System.out.println("method xyz");
	}
	
	@BeforeClass
	void bc()
	{
		System.out.println("Method bs BeforeClass");
	}
	
	@AfterClass
	void ac()
	{
		System.out.println("Method as AfterClass");
	}
	@BeforeMethod
	void mt1()
	{
		System.out.println("method BeforeMethod");
	}
	
	@AfterMethod
	void mt2()
	{
		System.out.println("method AfterMethod");
	}
	
	@BeforeTest
	void bt()
	{
		System.out.println("Method bt BeforeTest");
	}
	
	@AfterTest
	void at()
	{
		System.out.println("Method at AfterTest");
	}
	
	

	@BeforeSuite
	void bs()
	{
		System.out.println("Method bs BeforeSuite");
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("Method as AfterSuite");
	}
}
