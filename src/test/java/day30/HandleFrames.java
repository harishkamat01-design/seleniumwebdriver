package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");   // webpage will load
		driver.manage().window().maximize();
		
		//before interacting with the frame we need to switch to the frame
		/* 3 ways we can find the locate:
			1. driver.switchTo().frame(id)
			2. driver.switchTo().frame(name)
			3. driver.switchTo().frame(WebElement)  - always used to go to one frame to another frame
			4. driver.switchTo().frame(index)
		*/
        
		//frame1  - webpage1
		WebElement frame1 = driver.findElement(By.xpath(" //frame[@src='frame_1.html']")); // write xpath and put this in variable as a webelement
		driver.switchTo().frame(frame1);     // use webelement in a frame command and switched to frame1 //now driver is in frame1
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Selenium");    // provide input as Selenium
		
		//driver need to comeback from frame 1 to main page then to page 2
		driver.switchTo().defaultContent();
		
		//frame2 - webpage2
		WebElement frame2 = driver.findElement(By.xpath(" //frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2); 
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Java");
		
		driver.switchTo().defaultContent();
		
		//frame3  - webpage3 
		WebElement frame3 = driver.findElement(By.xpath(" //frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3); 
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Automation");
		
		//inside the frame3 we have a frmae which is called as innerfarme nothing but iFrame
		//As there is only one frame inside the frame3 , we can use index otherwise we cant use when we has more than one iframe inside a frame
		driver.switchTo().frame(0);
		
		//get the link of the page that is 
		//https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true
		//open in new tab and get the xpath
		
		//driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[2]")).click();
		
		//sometimes we get error, so use javascript executor	 
		WebElement rdbutton = driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[2]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("arguments[0].click();", rdbutton);	
		
		
		driver.switchTo().defaultContent();
		
	}

}
