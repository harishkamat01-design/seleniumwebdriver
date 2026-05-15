package day38;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognito {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--incognito");               //settings for the headless mode of execution
		
		WebDriver driver = new ChromeDriver(option);               // need to pass option in the ChromeDriver                         
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://t-mobile.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("T-Mobile® Official Site | Best 5G Network & Unlimited Data Plans"))
		{
			System.out.println("correct");
		}
		
		System.out.println("Completed");
		
	}

}
