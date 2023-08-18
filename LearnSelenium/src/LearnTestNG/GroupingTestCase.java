package LearnTestNG;

import org.testng.annotations.Test;

public class GroupingTestCase {

	@Test(groups={"Apple"})
	public void apple1() {
		System.out.println("Apple Test Case 1");
	}
	
	@Test(groups={"Apple"})
	public void apple2() {
		System.out.println("Apple Test Case 2");
	}
	
	@Test(groups={"Samsung"})
	public void samsung1() {
		System.out.println("Samsung Test Case 1");
	}
	
	@Test(groups={"Samsung"})
	public void samsung2() {
		System.out.println("Samsung Test Case 2");
	}
	
	@Test(groups={"Moto"})
	public void moto1() {
		System.out.println("Moto Test Case 1");
	}
	
	@Test(groups={"Moto"})
	public void moto2() {
		System.out.println("Moto Test Case 2");
	}
	
	
	@Test(groups={"Realme"})
	public void realme1() {
		System.out.println("Realme Test Case 1");
	}
	
	@Test(groups={"Realme"})
	public void realme2() {
		System.out.println("Realme Test Case 2");
	}
	
}
