package day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationcentral.com/demo/slider_controls.html");
		
		Actions act = new Actions(driver);
		
		WebElement  start_point = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		System.out.println("Start point:  "+start_point.getLocation());// (758, 92)   //value 50
		
		act.dragAndDropBy(start_point, -500, 92).perform();
		System.out.println("After decreasing by 100:  "+start_point.getLocation());// (295, 92)      //value 00
		
		
		
		
		
	}

}
