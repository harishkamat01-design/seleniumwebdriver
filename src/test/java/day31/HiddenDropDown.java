package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	driver.get(" https://opensource-demo.orangehrmlive.com/web/index.php/auth/login ");
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
    driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
    
    //clicking on PIM
    driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
    
    //click on dropdown
    driver.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[6]/div[1]/div[2]/div[1]/div[1]")).click();
	Thread.sleep(5000);
	
    //select single option  Finance Manager
    driver.findElement(By.xpath("//span[normalize-space()='Financial Analyst']")).click();
	
	//count number of options
   /* List<WebElement> option = driver.findElements(By.xpath("//div[@role='listbox']//span"));
    System.out.println("Total number of option:  "+option.size());
    
    //printing options
    for (WebElement op:option)
    {
    System.out.println(op.getText());
   
    }
   */
	}

}
