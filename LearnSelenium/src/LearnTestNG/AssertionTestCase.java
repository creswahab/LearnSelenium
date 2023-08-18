package LearnTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTestCase {
	
	String name="Jupiter";
	
	boolean value= true;
	
	@Test
	public void assertcase() {
		//Assert.assertEquals(name, "Jupiter");
		Assert.assertTrue(value, "This should be true");
	}

}
