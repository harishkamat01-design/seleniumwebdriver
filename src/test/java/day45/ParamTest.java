package day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest 
{
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br) throws InterruptedException
	{
		switch (br.toLowerCase())
		{
		case "chrome" : driver = new ChromeDriver(); break;
		case "edge"   : driver = new EdgeDriver(); break;
		case "firefox" :driver = new FirefoxDriver(); break;
		default: System.out.println("Invalid Browser"); return;
		}
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test
	void testLogo()
	{
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true);   // Equals will compare the value 
	}
	
	@Test
	void testTitle()
	{
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");   // here we know the TiTle for the comparison, so directly comparing.
		
	}
	
	@Test
	void testURL()
	{
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");   // here we know the TiTle for the comparison, so directly comparing.
		
	}
	
	@AfterClass
	void teardown()
	{
		driver.close();
	}
}
