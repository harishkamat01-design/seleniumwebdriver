package day26;
//conditional methods always apply on WebElement not on the webpage
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods 
{
	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");

		//isDisplayed()  - verify the logo is displayed or not
		//WebElement logo = driver.findElement(By.xpath(" //img[@alt='nopCommerce demo store'] "));
		//logo.isDisplayed();
		//System.out.println("Display status of logo:  "+ logo.isDisplayed() ); // true
		
		//OR
		
		boolean logo1 = driver.findElement(By.xpath(" //img[@alt='nopCommerce demo store'] ")).isDisplayed();
		System.out.println("Display status of logo:  "+ logo1);
	
	   //isEnabled()   --> input box, dropdowns , checkboxes, radio buttons
		
        boolean status = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
        System.out.println("Status of the FN fied is:  "+ status);
	
	   //isSelected()
        WebElement male_rb=driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement female_rb=driver.findElement(By.xpath("//input[@id='gender-female']"));
        
        System.out.println("Status Before Selecting the radio button");
        System.out.println(male_rb.isSelected()); //false
        System.out.println(female_rb.isSelected());  //false
        System.out.println("=========================================");
        	
        System.out.println("Status After Selecting the radio button");
        male_rb.click();   // selecting the radio button
        System.out.println(male_rb.isSelected()); //true
        System.out.println(female_rb.isSelected());  //false
        System.out.println("=========================================");
        
        System.out.println("Status After Selecting the radio button");
        female_rb.click();   // selecting the radio button
        System.out.println(male_rb.isSelected()); //false
        System.out.println(female_rb.isSelected());  //true
        System.out.println("=========================================");
        
        //Checkbox ---Newsletter is alraedy selected 
        boolean newsletter = driver.findElement(By.xpath("//input[@id='NewsLetterSubscriptions_0__IsActive']")).isSelected();
        System.out.println("Newsletter checkbox status: " + newsletter); //true
      
	
	}

}
