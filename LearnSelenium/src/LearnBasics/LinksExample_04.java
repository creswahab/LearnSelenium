package LearnBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksExample_04 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pwaha\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/link.xhtml");
		
		//driver.findElement(By.linkText("Go to Dashboard")).click();
		
		driver.findElement(By.partialLinkText("Dashboard")).click();
		
		driver.quit();
	}

}
