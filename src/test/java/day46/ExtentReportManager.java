package day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener
{
	public ExtentSparkReporter sparkReporter; //UI of the report
	public ExtentReports extent;              //populate common info on report
	public ExtentTest test;                   //creating test case entries in report and update the status of test methods

	public void onStart(ITestContext context) 
	{
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+ "/reports/myReport.html");//specific location of the report in html
		
		sparkReporter.config().setDocumentTitle("Automation Report"); //Title of the Report
		sparkReporter.config().setReportName("Functional Testing"); //Name of the Report 
		sparkReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Computer name","Localhost");
		extent.setSystemInfo("Environment","UAT1");
		extent.setSystemInfo("Tester name","Harish");
		extent.setSystemInfo("OS","Windows11");
		extent.setSystemInfo("Browser name","Chrome");
		
	}
	
	public void onTestSuccess(ITestResult result )
	{
		test=extent.createTest(result.getName()); //creates a new entry in the report
		test.log(Status.PASS, "Test case PASSED is:" + result.getName()); //updates status as p/f/sk
	}
	
	public void onTestFailure(ITestResult result )
	{
		test=extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case Failed is:" + result.getName()); 
		test.log(Status.FAIL, "Test case Failed cause is:" + result.getThrowable());
	}
	
	public void onTestSkipped(ITestResult result )
	{
		test=extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case SKIPPED is:" + result.getName()); 
	}
	
	
	public void onFinish(ITestContext context)
	{
		extent.flush();
	}

}
