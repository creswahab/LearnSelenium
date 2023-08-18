package SeleniumInterviewQuestions;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class HandleExceptions_26 {
	
	@Test(timeOut = 2000, expectedExceptions = ThreadTimeoutException.class)
	public void testcase1() throws InterruptedException {
		System.out.println("This is the Test 1");
		Thread.sleep(3000);
		System.out.println("This is the Test 2");
	}

}
