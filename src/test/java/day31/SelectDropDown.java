package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver	.manage().window().maximize();
		
		driver.get(" https://testautomationpractice.blogspot.com/ ");
		
       //1) Select class we can use Select type of Dropdowns
		
		 WebElement drpCountryEle =driver.findElement(By.xpath("//select[@id='country']"));
		
		Select drpCountry = new Select(drpCountryEle);  // put the element in Select by creating the select object
		
		// 3 methods are in Select class
		drpCountry.selectByContainsVisibleText("Japan");
		//drpCountry.selectByValue(" japan ");
		//drpCountry.selectByIndex(6);   // index starts from 0 always , so Japan is 6
		
		//capture all the options from the dropdown by using getOptions() method
		List<WebElement> options = drpCountry.getOptions();             //create a variable options
		System.out.println( "Total options: " + options.size());
		
		// printing the options or elements from the dropdowns //all these are List collection which is web element
		/*
		 for (int i=0;i<options.size();i++)
		 
		{
			System.out.println(options.get(i).getText());
		}
		*/
		for(WebElement op:options )
		{
			System.out.println(op.getText());  // we are not using the get() method as there is concept of indexing in the enhanced for loop
		}	
		
	}

}
