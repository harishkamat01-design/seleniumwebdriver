package day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();                                  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://t-mobile.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		//1. full page :Using the TakesScreenshot interface just like javascriptexecutor interface (refer the image)
	/*
		TakesScreenshot ts = (TakesScreenshot) driver;   // Type casted that is up-casted // TakesScreenshot is interface
        
		ts.getScreenshotAs(OutputType.FILE);    // this will generate a screenshot in file format  //getScreenshotAs calling from TakesScreenshot interface 
	
		File SourceFile = ts.getScreenshotAs(OutputType.FILE);   // System stored the file somewhere in system that we dont know
	  //File targetFile = new File("C:\\Users\\hpk13\\eclipse-workspace\\seleniumwebdriver\\screenshot\\fullpage.png");   
		File targetFile = new File( System.getProperty("user.dir")   + "\\screenshot\\fullpage.png");          // our location //file i a class
        
        //copy the file from sourcefile to targetfile 
		SourceFile.renameTo(targetFile);
		
		System.out.println("completed");
      */  
        
        // we can take only one screenshot      ts.getScreenshotAs(OutputType.FILE);    
		
      /*  
        //2.  specific area of the page 
		WebElement explore =  driver.findElement(By.xpath("//div[@id='XFTMO-HP-MOD-11']//div[contains(@class,'aem-Grid aem-Grid--12 aem-Grid--default--12')]"));
		explore.getScreenshotAs(OutputType.FILE);       //getScreenshotAs calling from WebElement interface 
		
		File sourceFile2= explore.getScreenshotAs(OutputType.FILE);
        File targetFile2 = new File( System.getProperty("user.dir")   + "\\screenshot\\fullpage1.png"); 
        sourceFile2.renameTo(targetFile2);
		
        System.out.println("completed");
        driver.quit();
		
      */ 
		
    // capture the screenshot of the webelement (Tmobile logo)
       WebElement logo = driver.findElement(By.xpath("//a[@data-domain-mapping='tmo']//img[@alt='T-Mobile']"));  //xpath is assigned to logo
       logo.getScreenshotAs(OutputType.FILE);                                                                    //takes the screenshot
       File sourceFile3 = logo.getScreenshotAs(OutputType.FILE);                                               //screenshot to system location
       
       File outputFile3 = new File( System.getProperty("user.dir")   + "\\screenshot\\fullpage2.png");   // MY location is specified
       
       sourceFile3.renameTo(outputFile3);                                                                // moved from system to My location
       
       System.out.println("completed");
       driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
