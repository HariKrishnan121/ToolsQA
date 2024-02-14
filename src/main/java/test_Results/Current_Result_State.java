package test_Results;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Current_Result_State implements ITestListener{

	
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started" + result.STARTED);
		System.out.println(result.getStartMillis());
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getStatus());
		System.out.println(result.isSuccess());
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getStatus());
		
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println(result.SUCCESS_PERCENTAGE_FAILURE);
	}
	
	
	
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getSkipCausedBy());
	}
	
	public void onFinish(ITestContext context) {
		System.out.println(context.getName());
		
	}
}
