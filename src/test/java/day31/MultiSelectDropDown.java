	package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get(" https://testautomationpractice.blogspot.com/ ");
	
		 //Print all the options from dropdown
		List<WebElement> all=driver.findElements(By.xpath(" //select[@id='colors']"));
	
		for (WebElement op : all)
		{
			System.out.println("All the cours in dropdown:  "+op.getText());                       // all options printed
		}
		System.out.println("====================================================================");
		for (int i=0; i<all.size(); i++)                                    
		{
			System.out.println("All the cours in dropdown:  " + all.get(i).getText());               // all options printed
		
		}
		System.out.println("====================================================================");
		//selecting single option
		driver.findElement(By.xpath("//option[@value='blue']")).click();    //blue is selected
		driver.findElement(By.xpath("//option[@value='green']")).click();   //green is selected
		System.out.println("====================================================================");
		// for selecting multiple options
		
		for (WebElement op : all)
		{
			String options = op.getText();
			
			if( options.equals("Red")  ||  options.equals("Green") ) 
			{
				op.click();
		
			}
		}
		System.out.println("====================================================================");
	
		WebElement  drpCountryEle =driver.findElement(By.xpath("//select[@id='animals']"));
		  Select ani =   new Select(drpCountryEle);
		  ani.selectByValue("cat");  //single option selecting by select class as select tag is there.
		
		
		
	}

}
