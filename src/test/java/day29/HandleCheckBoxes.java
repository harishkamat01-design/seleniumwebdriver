package day29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//select specific checkbox
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();   // checkbox of Sunday will be checked
		
		// Select all the checkboxes
		//1. capture all the webelements which has the check boxes from Sunday to Saturday
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	
		
		//===============================================================================================================
		//1)
		/*
		for (int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
			
		}
		*/
		//===============================================================================================================		
		//Enhanced for loop 
		/*
		for ( WebElement x : checkboxes)
		{
			x.click();
		}
		*/
	    //===============================================================================================================	
		// 2) I want to select last 3 checkboxes
		//Total no. of checkboxes -number of checkboxes to be selected = Starting index 
		//7 - 3 = 4(starting index)
		/*
		for (int i=4;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
			
		}
		*/
		//===============================================================================================================	
		// 3)I want to select first 3 checkboxes
		/*
		for (int i=0;i<3;i++)
		{
			checkboxes.get(i).click();
			
		}
		*/
		//===============================================================================================================	
       // 4)I want to uncheck the checked checkboxes
		
		for (int i=0;i<3;i++)
		{
			checkboxes.get(i).click();	   // index 0,1,2 are selected
		}
		
		Thread.sleep(5000);
		
		for (int i=0;i<checkboxes.size();i++)                   
		{
			if(checkboxes.get(i).isSelected())   // condition
			{
			checkboxes.get(i).click();  //   clicks the checkboxes which are checked
		    }
		}
	} 
}
