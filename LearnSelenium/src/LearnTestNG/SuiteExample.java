package LearnTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	WebDriver driver;
	long startTime;
	long endTime;
	
	@BeforeSuite
	public void beforeStart() {
		startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pwaha\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void openGoogle() {
		driver.get("https://www.google.co.in");
	}
	
	@Test
	public void openBing() {
		driver.get("https://www.bing.com");
	}
	
	
	@Test
	public void openWikepedia() {
		driver.get("https://www.wikipedia.org");
	}
		
	@AfterSuite
	public void afterEnd() {
		driver.quit();
		endTime = System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("The Total Time Taken is "+totalTime);
		
	}

	
	
		
		
	}
	
