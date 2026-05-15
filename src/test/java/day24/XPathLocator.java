package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocator {

	public static void main(String[] args)   {
		 WebDriver driver = new ChromeDriver();
		    driver.get("https://www.t-mobile.com/");
		    driver.manage().window().maximize();
		    
		   
		    //xpath
		    //driver.findElement(By.xpath(" //a[@data-analytics-navigation-name='Phones & devices'] ")).click(); //Click on the Phones & devices
		    //System.out.println("Passed1");
		    
  //===================================================================================================================
		    //xpath with single attribute
		    //driver.findElement(By.xpath(" //img[@alt='Apple iPhone 17 Pro']")).click();   // click on the phone image Apple iPhone 17 Pro
		   // System.out.println("Passed2");
 //===================================================================================================================		    
		   // driver.wait(2000);
		    //xpath with multiple attribute
		   //driver.findElement(By.xpath("//button[@class='tdds-tab'][@id='TabSpecs-tab']")).click();  //not working igonre
 //===================================================================================================================	   
		   //xpath with and or operator
		  // driver.findElement(By.xpath("  //button[@type=\"button\" and @class=\"unav-account__toggle unav-headerTool__link unav-headerTool__link--filled\"] ")).click();
		   //System.out.println("Passed3");
//===================================================================================================================   
		    //xpath with innerText - text() 
		   //driver.findElement(By.xpath(" //a[ text()='Plans']   ")).click();  // click on Plans 
		   
		   // driver.findElement(By.xpath("//span[text()='My account']")).click();   // click on My account
		    
		    
          // boolean text =driver.findElement(By.xpath(" //p[text()='Best Mobile Network in the U.S. according to Ookla® Speedtest®. ']  " )).isDisplayed(); 
		  // System.out.println(text);       //true
		    
		   // String texton = driver.findElement(By.xpath(" //p[text()='Best Mobile Network in the U.S. according to Ookla® Speedtest®. ']  " )).getText(); 
		   // System.out.println(texton);    //Best Mobile Network in the U.S. according to Ookla® Speedtest®. Get full terms
 	
//===================================================================================================================	
	   /*
	    //xpath  conatins()     ---  //tag [contains( @attribute  , 'value'  )]
	   
		    boolean esponal = driver.findElement(By.xpath(" //a[contains(@class,'langLink lang-es')]  ")).isDisplayed();
	  	System.out.println(esponal);  //true
	    
	    
	   String french =  driver.findElement(By.xpath(" //a[contains(@class,'langLink lang-es')]  ")).getText();
	  System.out.println(french); //Español
	 	 */
	//===================================================================================================================	
		   //xpath  conatins()     ---  //tag [stsrts with ( @attribute  , 'value'  )]
		    
		    //instaed of es.t-mobile.com   I have written es.t-mobile  - then also it is passed
		    
			//boolean esponal1 = driver.findElement(By.xpath(" //a[starts-with(@data-href,'es.t-mobile')]  ")).isDisplayed();
		  	//System.out.println(esponal1); // true
		    
		    
		  //String french1 =  driver.findElement(By.xpath(" //a[starts-with(@data-href,'es.t-mobile')]  ")).getText();
		  //System.out.println(french1); //Español
//===================================================================================================================			    
		   //chained XPath - --- when we dont have the attribute and inner text , we go for chained XPath
		    
		    driver.findElement(By.xpath(" 	   //div[@class=\"unav-header__account\"]/div/button  ")).click();   //click on the Account button
		    System.out.println("Clicked");
		    
		    
		    
		    
	}

}
