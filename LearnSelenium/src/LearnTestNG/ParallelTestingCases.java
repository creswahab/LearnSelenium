package LearnTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestingCases {
	

	@Test
	public void openGoogle() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\pwaha\\\\selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.quit();
	}
	
	@Test
	public void openBing() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\pwaha\\\\selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com");
		driver.quit();
	}
	
	
	@Test
	public void openWikepedia() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\pwaha\\\\selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org");
		driver.quit();
	}

}
