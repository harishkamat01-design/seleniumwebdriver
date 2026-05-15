package day36;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
		//driver.get("https://www.t-mobile.com/");
		//from above code , On top of goole page , t-mobile page will be displayed and google page will disapeared. 
		
		//Requirement: open google in one window and tmobile in another tab.
		driver.get("https://www.google.com/");
		driver.switchTo().newWindow(WindowType.TAB); 
		driver.get("https://www.t-mobile.com/");
		
		//Requirement: OPen google and t-mobile in 2 sepatrate windows.	
		driver.switchTo().newWindow(WindowType.WINDOW); 
		driver.get("https://www.google.com/");
		driver.switchTo().newWindow(WindowType.WINDOW); 
		driver.get("https://www.t-mobile.com/");
		
		
		

	}

}
