package day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts 
{

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.manage().window().maximize();
	
	// 1) Normal buttons with Ok button
	    /*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();     // clicking on the locator
	    Thread.sleep(5000);                                                 // for my own purpose i have put
	    //driver.switchTo().alert().accept();
	    
	    //If you want to do some operation such as to get the name or text from the alert 
	    
	    Alert myalert = driver.switchTo().alert();                          // switched to Alert popup
	    System.out.println("Text in the Alert:  " + myalert.getText());     //I am a JS Alert
	    myalert.accept();                                                   // accept is clicking on OK button
       */
	   
    // 2) Confirmation Alert having OK and Cancel Button
	/*
	 driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click(); 
	//driver.switchTo().alert().accept();    // OK button
	driver.switchTo().alert().dismiss();   // cancel button
	 */
	
	// 3) Prompt Alert with input along with OK&Cancel button
	driver.findElement(By.xpath(" //button[normalize-space()='Click for JS Prompt'] ")).click(); 
	Thread.sleep(5000);
	
	Alert myalert = driver.switchTo().alert();  //switch to alert
	myalert.sendKeys("Welcome");            // U will not be able to see the value entering in the Alert 
	myalert.accept();                       //close
	 
	
	
	
	
	
	    
	    
	    
	    
	}

}
