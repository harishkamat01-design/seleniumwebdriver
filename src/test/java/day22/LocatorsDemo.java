package day22;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		//driver.get("https://demo.nopcommerce.com/");
		driver.get("https://www.t-mobile.com/");
		driver.manage().window().maximize();
	//--------------------------------------------------------------------------------	
//name
		//validate search box
		//driver.findElement(By.name("q")).sendKeys("apple");  //apple will be typed on search bar
	//--------------------------------------------------------------------------------
//id
		//Validate subscribe button is present or not?
		//boolean presentornot = driver.findElement(By.id("newsletter-subscribe-button")).isDisplayed();
		//System.out.println(presentornot);  //true      
	//--------------------------------------------------------------------------------
//linkText and partialLinkText - only for locating the links
		//in html :   a href means link a=anchor tag    attribute href=hyperlink reference 
		//generally link will be associated with text > we need to sue that text 
		// there is one more text named inner text where tag "a href " will not be present for the link
		//so  we need to first see a href=link then only we can write the linkText
	
        //click on the Computers
		//linkText is not an attribute its an linked text
		//driver.findElement(By.linkText("Computers")).click();   //click on computers
		
//PartialLinkText will use only some alphabets of the word and locates the element
		//ex: Computers, instead, i can give Compute, but this might cause a conflict with the same word in the web page and 
		//we might be redirected to wrong page. So most of the time we don't refer partial link text 
		
		//driver.findElement(By.partialLinkText("Computers")).click();   //click on computers
		
		//driver.findElement(By.linkText("Plans")).click();
//------------------------------------------------------------------------------------------		
//Tagname is locator , this is used for identifying group of web element and not for specific web element in the Webpage.	
//Class is a category for same kind of elements like radio buttons, check boxes.
		
		//note: user list >ui   and list item >li  in HTML
		
		//classname  - to find the number of Links in the hearder
		List<WebElement> headerlinks = driver.findElements(By.className("unav-nav__item"));
		System.out.println("Total number of links in header is: "  + headerlinks.size());
		
		
		//tagname   - to find total number of links in the web page
		List<WebElement>  links = driver.findElements(By.tagName("a"));
	    System.out.println("Total number of links in the page is:  "   +  	links.size());
	    
	    List<WebElement>  images = driver.findElements(By.tagName("img"));
	    System.out.println("Total number of images in the page is:  "   +  	links.size());
	    
		
		
		
		
		
		
		
		
		
		
	}

}
