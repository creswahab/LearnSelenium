package SeleniumInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputWithoutSendKeys_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pwaha\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in");
		
		WebElement searchBox = driver.findElement(By.name("q"));
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		//executor.executeScript("document.getElementsByName('q')[0].value='Jupiter'", "");
		
		executor.executeScript("arguments[0].value='Jupiter'", searchBox);
		
	}

}
