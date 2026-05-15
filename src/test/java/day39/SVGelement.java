package day39;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGelement
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://t-mobile.com/");
		driver.manage().window().maximize();
		
		WebElement arrow = driver.findElement(By.xpath("//button[@type='button' and @aria-label='Next Content']//*[name()='svg']"));
		arrow.click();
		
		System.out.println("Completed");
		
 //xpath not working
	}

}
