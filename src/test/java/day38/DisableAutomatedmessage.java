package day38;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableAutomatedmessage {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options =new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});        
		
		WebDriver driver = new ChromeDriver(options);                         
		driver.get("https://t-mobile.com/");
		
		System.out.println("Title: " + driver.getTitle());
		System.out.println("Completed");
		
	}

}
