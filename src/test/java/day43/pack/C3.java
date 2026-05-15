package day43.pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class C3 
{
	void pqr()
	{
		System.out.println("Method pqr");
	}

	@BeforeSuite
	void bs()
	{
		System.out.println("Method bs");
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("Method as");
	}
}
