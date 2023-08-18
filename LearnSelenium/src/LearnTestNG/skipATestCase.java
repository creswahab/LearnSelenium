package LearnTestNG;

import org.testng.annotations.Test;

public class skipATestCase {
	@Test(priority=0, enabled=false)
	public void startTheCar() {
		System.out.println("Start the Car");
	}
	
	@Test(priority=1)
	public void firstGear() {
		System.out.println("This is First Gear");
	}
	
	@Test(priority=2)
	public void secondGear() {
		System.out.println("This is Second Gear");
	}
	
}
