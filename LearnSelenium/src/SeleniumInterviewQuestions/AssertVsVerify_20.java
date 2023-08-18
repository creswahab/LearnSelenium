package SeleniumInterviewQuestions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertVsVerify_20 {

	/*
	 * @Test public void testcase1() {
	 * 
	 * System.out.println("Before Assertion"); Assert.assertEquals(true, false);
	 * System.out.println("After Assertion"); }
	 */
	
	@Test
	public void testcase2() {
		System.out.println("Before Assertion");
		
		SoftAssert assert1 = new SoftAssert();
		assert1.assertEquals(true, false);
		System.out.println("After Assertion");
	}
	
}
