package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();    //up-casting
		driver.get("https://www.t-mobile.com/");   //launch the chrome browser
		driver.manage().window().maximize();        // maximize the window
		//==================================================================================================	 
		//tag id    --     tag#id     or #id  -- id is always unique
		//driver.findElement(By.cssSelector("a#button-232d7e5c33")).click();   
		//OR
		//driver.findElement(By.cssSelector("#button-232d7e5c33")).click(); 
		//==================================================================================================	
		//tag class  --tag.classname    click on Plans
		driver.findElement(By.cssSelector("a.unav-headerNav__header-link")).click();
		
		//==================================================================================================
		//tag attribute  --tag[attribute="value"]     img[alt="T-Mobile"]
	      driver.findElement(By.cssSelector(" label[for='tiles-lines-1'] ")).click(); 
	
	    //Actually we should use "T-Mobile", but we cant use this as inside one " ", we cant use another " "
	  //===================================================================================================
		//tag class attribute -tag.classname[attribute="value"] 
		
		//driver.findElement(By.cssSelector(" div.unav-transactionalHeader__tool[x-data='unavBack()']  ")).click();
		System.out.println("I am on the Home Page now");
	    
	    
	
	}

}
