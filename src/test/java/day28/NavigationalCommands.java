package day28;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands 
{

	public static void main(String[] args) throws MalformedURLException 
	{
		WebDriver driver =new  ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");   //accepts only URL in String format 
		
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  
		
		//accepts URL in String format and also in URL Object format
		//URL myurl =new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.navigate().to(myurl);
		//======================================================================================================================
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to(" https://www.youtube.com/ ");
		System.out.println(driver.getCurrentUrl());                 //youtube
		System.out.println("===================================");
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());                 //oranehrm
		System.out.println("===================================");
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());                 //youtube
		System.out.println("===================================");
		
		driver.navigate().refresh();
		System.out.println("=====refreshed====");
		System.out.println("===================================");
		//======================================================================================================================
		
		
		
		
	}

}
