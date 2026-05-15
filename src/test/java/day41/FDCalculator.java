package day41;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		driver.manage().window().maximize();
		
		String filePath = System.getProperty("user.dir")+ "\\testdata\\caldata.xlsx";   //Pass the filePath in every method.
		int rows = ExcelUtils.getRowCount(filePath, "Sheet1");                          // get row count
		
		for(int i=1; i<=rows;i++)                                                       //i=0 is the header which we dont need 
		{
			// 1. read data from excel
			String pri  =ExcelUtils.getCellData(filePath, "Sheet1", i, 0);
			String roi  =ExcelUtils.getCellData(filePath, "Sheet1", i, 1);
			String prd1 =ExcelUtils.getCellData(filePath, "Sheet1", i, 2);
			String prd2 =ExcelUtils.getCellData(filePath, "Sheet1", i, 3);
			String frq  =ExcelUtils.getCellData(filePath, "Sheet1", i, 4);
			String exp_matValue  =ExcelUtils.getCellData(filePath, "Sheet1", i, 5);
			
			
			// 2. pass above data in to the application
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(pri);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(roi);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(prd1);
			
			Select  prddrp  = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")) );    //dropdown with select tag , so use select class
			prddrp.selectByVisibleText(prd2);
			
			Select frqdrp = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			frqdrp.selectByVisibleText(frq);
			
			driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();          //Click Calculate
			
			// 3. Validation 
			String act_matvalue = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();   // value from application
			
			//Rem: Both exp_matValue and act_matvalue are String , but value generated is Double in application
			//use Double.parseDouble();
			
			if (Double.parseDouble(exp_matValue)  ==  Double.parseDouble(act_matvalue))
			{
				 System.out.println("Test Passed");
				 ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Passed");  //writing value into the cell
				 ExcelUtils.fillGreenColor(filePath, "Sheet1", i, 7);	 
			}
			else 
			{
				System.out.println("Test Failed");
				 ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Failed");  //writing value into the cell
				 ExcelUtils.fillRedColor(filePath, "Sheet1", i, 7);	
			}
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@class='PL5']")).click();  //click on clear button
			
		}  // ending of for loop
		
		driver.quit();
	}

}
