package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();  // ChromeDriver constructor will open the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");     // performs some action and doesnt return anything
		Thread.sleep(5000);
		
		
		String title = driver.getTitle();  // returns the title of the url and its is String return type, so we can print that string value.
        System.out.println("Title of the page is:   "  + title);    // OrangeHRM
	
	   // driver.getCurrentUrl(); // returns the URL in the form of String, we can store in the variable like above.otherwise we can directly print.
	   // System.out.println("Current Page URL is:  "+  driver.getCurrentUrl());
	
	   //getPageSource() - returns source code of the page
	   //System.out.println("Page Source of the page is:   " + driver.getPageSource());
	
        //getWindowHandle() - returns ID of the single Browser window   --> this keeps on changing each time when we launch the browser
       // String windowid = driver.getWindowHandle();
       // System.out.println("Window ID : " + windowid);   // 34BD7B69E19B6A63D295C11585E5699F
	
        //getWindowHandles() - returns ID's of the multiple Browser windows, so it should be Set
        
       driver.findElement(By.linkText("OrangeHRM, Inc")).click();   // new browser window and old window both id's will be written
       Set<String> windowids=driver.getWindowHandles();
       System.out.println(windowids);    //[F667CDB80F9A06BD827489C479E7371F, 3497C9132EE319156789B27101B58608]
       	
       
       
        
           
	}
	

}
