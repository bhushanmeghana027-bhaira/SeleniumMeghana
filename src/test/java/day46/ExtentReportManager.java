package day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {
	  public ExtentSparkReporter sparkReporter;  // UI of the report
	    public ExtentReports extent;               // populate common info on the report
	    public ExtentTest test;                    // create test entries & update status
	    
	    public void onStart(ITestContext context) {

	        sparkReporter = new ExtentSparkReporter(
	            System.getProperty("user.dir") + "/reports/myReport.html"
	        );

	        sparkReporter.config().setDocumentTitle("Automation Report"); // title
	        sparkReporter.config().setReportName("Functional Testing");   // report name
	        sparkReporter.config().setTheme(Theme.DARK);

	        extent = new ExtentReports();
	        extent.attachReporter(sparkReporter);

	        extent.setSystemInfo("Computer Name", "localhost");
	        extent.setSystemInfo("Environment", "QA");
	        extent.setSystemInfo("Tester Name", "Pavan");
	        extent.setSystemInfo("OS", "Windows10");
	        extent.setSystemInfo("Browser name", "Chrome");
	    }
	    public void onTestSuccess(ITestResult result) {

	        test = extent.createTest(result.getName()); // create a new entry in the report
	        test.log(Status.PASS, "Test case PASSED is:" + result.getName()); // update status
	    }
	    
	    public void onTestFailure(ITestResult result) {

	        test = extent.createTest(result.getName());

	        test.log(Status.FAIL, "Test case FAILED is:" + result.getName());
	        test.log(Status.FAIL, "Test Case FAILED cause is: " + result.getThrowable());
	    }
	    public void onTestSkipped(ITestResult result) {

	        test = extent.createTest(result.getName());

	        test.log(Status.SKIP, "Test case SKIPPED is:" + result.getName());
	    }
	    public void onFinish(ITestContext context) {
	    	extent.flush();
	    }
}
