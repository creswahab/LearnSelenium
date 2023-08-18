package LearnTestNG;

import org.testng.annotations.Test;

public class PriorityTestCase {
	
	@Test(priority=0)
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
	
	
	@Test(priority=3)
	public void thirdGear() {
		System.out.println("This is Third Gear");
	}
	
	
	@Test(priority=4)
	public void fourthGear() {
		System.out.println("This is Fourth Gear");
	}
	

}
