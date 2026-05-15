package day43.pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 
{
	@Test
	void abc()
	{
		System.out.println("method from C1");
	}
	
	@BeforeTest
	void bt()
	{
		System.out.println("Method bt");
	}
	
	@AfterTest
	void at()
	{
		System.out.println("Method at");
	}
}
