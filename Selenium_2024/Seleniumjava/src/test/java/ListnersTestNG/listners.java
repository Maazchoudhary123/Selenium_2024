package ListnersTestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listners implements ITestListener

{
	  public void onStart(ITestContext context) {
		  System.out.println("Test started on Start...");
		  }
	  
	  public void onTestStart(ITestResult result) {
		  System.out.println("onTest start method");
		  }
	 
	  public void onTestSuccess(ITestResult result) {
		  System.out.println("Test success");
		  }
	  
	  public void onTestFailure(ITestResult result) {
		  System.out.println("Test Failure...");
		  }
	  
	  public void onTestSkipped(ITestResult result) {
		  System.out.println("Test skipped");
		  }
	  
	  public void onFinish(ITestContext context) {
		  System.out.println("Test finished...");
		  }
	

}
