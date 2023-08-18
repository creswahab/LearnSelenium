package SeleniumInterviewQuestions;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListeners_17_02 implements IRetryAnalyzer {

	int failedCount=0;
	int limit=4;
	
	@Override
	public boolean retry(ITestResult result) {
		
		if (failedCount<limit) {
			failedCount++;
			
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

}
