package day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
/*
 1.Open the chrome browser
 2.Open URL (https://demo.opencart.com)
 3.Validate title should be  "Your Store"
 4.Close browser
 */

public class FirstTestCase 
{
	public static void main(String[] args)  
	{
		//1.Open the chrome browser
		//ChromeDriver driver1 =new ChromeDriver();  // constructor in the ChromeDriver class will launch the chrome browser.
		WebDriver driver =new ChromeDriver();  //this is up-casting as WebDriver Parent
		
		//WebDriver driver =new EdgeDriver();
		
		
		//=========================================================================
		
		// 2.Open URL (https://demo.opencart.com)    or https://demo.nopcommerce.com/
		driver.get("https://demo.nopcommerce.com/");
		
		//=========================================================================
		// 3.Validate title should be  "Your Store"   or nopCommerce demo store. Home page title
		
		String at = driver.getTitle();
		
		if (at.equals("nopCommerce demo store. Home page title"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		//=========================================================================
		//4.Close the browser
		//driver.close();
		//driver.quit();
		
//After execution : java.net.SocketException: Connection reset     Warning comes, ignore it.	
	}

}
