package day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo 
{
	WebDriver driver;
	
	@BeforeClass
	void setup() throws InterruptedException
	{
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	}
	
	@Test(dataProvider="dp")
	void testLogin(String email, String pwd) throws InterruptedException
	{
		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(email); 
		    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd); 
		    driver.findElement(By.xpath("//button[normalize-space()='Login']")).click(); 
		   
		    Thread.sleep(5000);  
	}
	
	@DataProvider(name = "dp",indices= {0,2})    // THIS IS NOT RANGE, this is index position. 
	Object[][] loginData()               
	{
		Object data[][] =                               //2D array  // Object data type can store all kinds data
			{ 
				{  "Admin1", "admin1234"  },   //0
				{  "Admin2", "admin123@"   },   //1
				{  "Admin", "admin123"   }      //2
		    };
	return data;	                                    //return the data
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	
	
}
