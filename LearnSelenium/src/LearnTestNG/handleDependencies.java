package LearnTestNG;

import org.testng.annotations.Test;

public class handleDependencies {

	@Test(priority=0)
	public void secondarySchool() {
		System.out.println("This is Secondary School");
	}
	
	@Test(priority=1, dependsOnMethods = "secondarySchool")
	public void HighSchool() {
		System.out.println("This is High School");
	}
	
	@Test(priority=2, dependsOnMethods = "HighSchool")
	public void College() {
		System.out.println("This is College");
	}
}
