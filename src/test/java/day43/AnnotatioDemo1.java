package day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 1. Login  2.Search 3.Logout 4.Login 5.AdvanceSearch 6.Logout
 */

public class AnnotatioDemo1 
{
	@BeforeMethod
	void login()
	{
		System.out.println("login");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("search");
	}
	
	@Test(priority=2)
	void advanceSearch()
	{
		System.out.println("advanceSearch");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("logout");
	}
	
}

