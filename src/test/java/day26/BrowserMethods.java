package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();  // ChromeDriver constructor will open the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");     // performs some action and doesnt return anything
		Thread.sleep(5000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();   // new browser window and old window both id's will be written
        Thread.sleep(5000);
        //driver.close(); //As driver is on the first window, first window got closed. AS driver is focused on first window, first window is closed.
       driver.quit(); // closes all the windows at a time
        
           
	}
	

}
