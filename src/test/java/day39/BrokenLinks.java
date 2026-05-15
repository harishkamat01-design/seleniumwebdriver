package day39;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 
 Condition to check: 
1. Link should have href attribute
2. Then we should get and hit the URL which will return the status code
3. If the Status code >= 400   -----> Broken code.

 */


public class BrokenLinks 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		//capture all the links from webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("no. of links:" +links.size());   //48
		
		int noOfBrokenLinks=0; 
		int noOfcorrectLinks=0;
		
		for(WebElement linkElement: links)
		{
			String hrefattValue = linkElement.getAttribute("href");
			
					if (hrefattValue==null  || hrefattValue.isEmpty())
					{
						System.out.println("Not possible to find");
						//continue;
					}
			
			//hit the url to server                   // try catch put it later 
			try
			{
					URL linkURL = new URL(hrefattValue); //converts String to URL
					HttpURLConnection  connect = (HttpURLConnection) linkURL.openConnection(); // creates a path between URL and Server
					connect.connect(); //connects link to server
					
					if(connect.getResponseCode()>=400)
					{
						System.out.println(hrefattValue + "=====> Broken Link");
						noOfBrokenLinks++;
					}
					else 
					{
						System.out.println(hrefattValue + "=====> Not a Broken Link");
						noOfcorrectLinks++;
					}
			}
			catch(Exception e)
			{
				
			}
		}
		System.out.println("No. of broken liks:   " + noOfBrokenLinks);
		System.out.println("No. of correct liks:   " + noOfcorrectLinks);
	}

}
