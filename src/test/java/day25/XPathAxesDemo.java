package day25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesDemo
{

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		
		String selftext = driver.findElement(By.xpath("  //a[contains(text(),'LIC')]/self::a  ")).getText();
		System.out.println("Self    : " +  selftext );  //LIC
		
		String parenttext = driver.findElement(By.xpath("  //a[contains(text(),'LIC')]/parent::td  ")).getText();
		System.out.println("Parent  : "+ parenttext);   // LIC
		
		String ancestortext = driver.findElement(By.xpath(" //a[contains(text(),\"LIC\")]/ancestor::tr  ")).getText();
		System.out.println("ancestor: "+ ancestortext);  // LIC A 840.45 898.80 + 6.94 Buy  |  Sell
		
		List<WebElement> childs= driver.findElements(By.xpath("//a[contains(text(),\"LIC\")]/ancestor::tr/child::td"));
		System.out.println("Number of Child Elements:  " + childs.size());  //6 
		
		List<WebElement> descendant= driver.findElements(By.xpath("//a[contains(text(),\"LIC\")]/ancestor::tr/descendant::*"));
		System.out.println("Number of descendant Elements:  " + descendant.size());  //10
		
		List<WebElement> followingnodes= driver.findElements(By.xpath("//a[contains(text(),\"LIC\")]/ancestor::tr/following::tr"));
		System.out.println("Number of followingnodes Elements:  " + followingnodes.size());  //1234
		
		List<WebElement> precedingnodes= driver.findElements(By.xpath("//a[contains(text(),\"LIC\")]/ancestor::tr/preceding::tr"));
		System.out.println("Number of precedingnodes Elements:  " + precedingnodes.size());  //260
		
		List<WebElement> followingsiblingnodes= driver.findElements(By.xpath("//a[contains(text(),\"LIC\")]/ancestor::tr/following-sibling::tr"));
		System.out.println("Number of followinsiblingnodes Elements:  " + followingsiblingnodes.size());  //260
		
		List<WebElement> precedingsiblingnodes= driver.findElements(By.xpath("//a[contains(text(),\"LIC\")]/ancestor::tr/preceding-sibling::tr"));
		System.out.println("Number of precedingsiblingnodes Elements:  " + precedingsiblingnodes.size());  //260
		
		
		
		
		
		
	}

}
