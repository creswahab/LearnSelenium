package SeleniumInterviewQuestions;

import org.testng.annotations.Test;

public class TestNG_MultipleTimes_24 {

	@Test(invocationCount = 3)
	public void testcase1() {
		System.out.println("This is the Test");
	}
}
