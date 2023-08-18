package LearnTestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization {
	
	@Test
	@Parameters("Name")
	public void enterName(String name) {
		
		System.out.println("The Name is "+name);
	}

}
