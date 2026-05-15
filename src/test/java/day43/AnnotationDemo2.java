package day43;

/*
1.Login  -- @BeforeClass
2.Search -- @Test
3.AdvanceSearch -@Test
4.Logout -- @AfterClass
 */

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationDemo2 
{

	@BeforeClass
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
	
	@AfterClass
	void logout()
	{
		System.out.println("logout");
	}
}
