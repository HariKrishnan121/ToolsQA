package test_Results;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_State  implements IRetryAnalyzer{

	
	private int retryCount = 0;
	private static int maxCount = 3;
	
	public boolean retry(ITestResult result) {
		if(!result.isSuccess() && retryCount < maxCount) {
			retryCount++;
			return true;
		}
		
		
		return false;
	}

}
