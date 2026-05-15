package day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoarsActions 
{
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://text-compare.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Selenium");
	
	Actions act = new Actions(driver);                     //Actions class construction need input so we passed driver
	
	//CTRL + A
	act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
	
	//CTRL + C
	act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
	
	//Tab
	act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	
	//CTRL + V
	act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();	
	
	System.out.println("Code working correctly");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    
	}

}
