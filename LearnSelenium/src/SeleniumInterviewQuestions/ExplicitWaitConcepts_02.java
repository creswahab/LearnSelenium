package SeleniumInterviewQuestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcepts_02 {

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
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement myProfile = wait.until(ExpectedConditions.
								elementToBeClickable(By.xpath("//*[@id='fadein']/div[1]/div/div/div[2]/ul/li[3]/a")));
		myProfile.click();
		
	}

}
