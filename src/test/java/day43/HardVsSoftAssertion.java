package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertion 
{
	//@Test
	void hardassertion()                     // static so no object creation possible
	{
		 System.out.println("Harish");
		 
		 Assert.assertEquals(123, 13);       // as this is failed, so below statement will not be executed
		 
		 System.out.println("Kamat");
	}
	
	
	@Test
	void softassertion()                        // not static, so we can create object.
	{
		 System.out.println("Harish");
		 
		 SoftAssert sa = new SoftAssert();    // it is mandatory use AsserAll method at the end for Soft Assert
		 sa.assertEquals(123, 13);            // if this is fail also , blow statement will be executed as we have created a object and used.
		 		 
		 System.out.println("Kamat");
		 sa.assertAll();     //mandatory
		 
	}
}
