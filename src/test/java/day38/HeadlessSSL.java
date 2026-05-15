package day38;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessSSL {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options =new ChromeOptions();
		options.setAcceptInsecureCerts(true);            //by default it is false, make it true
		
		WebDriver driver = new ChromeDriver(options);                         
		driver.get("https://expired.badssl.com/");
		
		System.out.println("Title: " + driver.getTitle());
		System.out.println("Completed");
		
	}

}
