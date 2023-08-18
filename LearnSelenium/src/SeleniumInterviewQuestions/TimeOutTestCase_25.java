package SeleniumInterviewQuestions;

import org.testng.annotations.Test;

public class TimeOutTestCase_25 {
	
	@Test(timeOut = 2000)
	public void testcase1() throws InterruptedException {
		System.out.println("This is the Test 1");
		Thread.sleep(3000);
		System.out.println("This is the Test 2");
	}

}
