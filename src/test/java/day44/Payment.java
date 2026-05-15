package day44;

import org.testng.annotations.Test;

public class Payment 
{
		@Test(priority=1,groups={"regression","sanity","functional"})
		void paymentinRupees()
		{
			System.out.println("Payment in Rupees");
		}
		
		@Test(priority=2,groups={"regression","sanity","functional"})
		void paymentinDollars()
		{
			System.out.println("Payment in Dollars");
		}

}
