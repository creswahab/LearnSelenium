package SeleniumInterviewQuestions;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class SwitchToActiveElements_16 {
	
	static WebElement q;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pwaha\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in");
		
		//driver.switchTo().activeElement().sendKeys("Jupiter"+Keys.ENTER);
		
		PageFactory.initElements(driver, SwitchToActiveElements_16.class);
		
		q.sendKeys("Jupiter"+Keys.ENTER);

	}

}
