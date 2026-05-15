package day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(" //a[normalize-space()='OrangeHRM, Inc'] ")).click();
		
		Set<String>  windowIds     =       driver.getWindowHandles();  
// got both the Ids in String format but I can read it as set dont have the indexing, so convertinto List which is array and indexing is there.
		
		/*
		//Approch 1 : when only 2 windows are there
		List<String>  windowList  = new ArrayList(windowIds); //converted to ArrayList which is having windowIds 
		
		String parentId = windowList.get(0);   // using get() method , we got the id's
		String childId = windowList.get(1);
		
		//Still over driver is on Parent window , so we need to know that, so we will get the title of the page where driver is on.
		System.out.println(driver.getTitle()); // ORANGEHRM - Parent window Url will come as driver is in the parent window
		
		driver.switchTo().window(childId);     // now driver is in child window
		System.out.println(driver.getTitle()); // HRMS link - Child window Url will come, now the driver is in the child window.
		
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle()); // ORANGEHRM - Parent window Url will come as driver is now in the parent window
		//====================================================================================================================
		
		*/
		
		for (String windid: windowIds)   // condition
		{
			
				String title = driver.switchTo().window(windid).getTitle();  // switch window and get title
			  
				if(    title.equals("OrangeHRM"))
				{
					System.out.println(driver.getCurrentUrl());  //some validation
					//output: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login      // else part is displayed
					
				}
			
		}
		
		
		
		 
		 
		 
	}

}
