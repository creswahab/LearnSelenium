package SeleniumInterviewQuestions;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTheGoogleResultUrl_14 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pwaha\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in");
		
		driver.findElement(By.name("q")).sendKeys("Game of Thrones"+Keys.ENTER);
		
		Thread.sleep(5000);
		
		/*
		 * List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		 * 
		 * for (WebElement webElement : allLinks) {
		 * System.out.println(webElement.getAttribute("href")); }
		 */
		
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//*[@id='search']//following::h3//following::div/cite"));
		
		for (WebElement webElement : allLinks) {
			 System.out.println(webElement.getText());
		}
		
		
	}
	
	
	

}
