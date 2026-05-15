package day29;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandleAuthenticatedAlert 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://the-internet.herokuapp.com/basic_auth");              // we can't handle 
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");       // Syntax
	}

}
