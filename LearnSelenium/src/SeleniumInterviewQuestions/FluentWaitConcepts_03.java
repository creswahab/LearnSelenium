package SeleniumInterviewQuestions;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcepts_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pwaha\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://phptravels.net/login");
		
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("user@phptravles.com");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("demouser");
		
		WebElement submit = driver.findElement(By.id("submitBTN"));
		submit.click();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).
										pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		
		WebElement myProfile = wait.until(new Function<WebDriver, WebElement>() {

			
			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return driver.findElement(By.xpath("//*[@id='fadein']/div[1]/div/div/div[2]/ul/li[3]/a"));
			}
		});
			
		myProfile.click();
	}

}
