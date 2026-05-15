package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwaitcommand 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();  
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));   --->implicit wait
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");    
		driver.manage().window().maximize();
		
		WebElement txtusername = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		txtusername.sendKeys("Admin");
		
		WebElement txtpassword = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		txtpassword.sendKeys("admin123");
	
		
		driver.findElement(By.xpath("	//button[normalize-space()='Login']")).click();
		
		System.out.println("Login clicked");
		
		
		
		
		
		
		
		
		
		//driver.findElement(By.xpath(" //input[@placeholder='Username']   ")).sendKeys("Admin");   
       //Exception in thread "main" org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"xpath","selector":" //input[@placeholder='Username']   "}
       
		
		// 3 steps: 1. Declaration    using WebDriverWait class
		          //2. find the element which element you want to apply implicit wait    that is input[@placeholder='Username' 
		          //3. Usage
		
		
		
		
		
		
		
		
		
	}

}
