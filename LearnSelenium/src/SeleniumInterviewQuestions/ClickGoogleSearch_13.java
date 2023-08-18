package SeleniumInterviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickGoogleSearch_13 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pwaha\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in");
		
		driver.findElement(By.name("q")).sendKeys("Game of Thrones");
		
		Thread.sleep(5000);
		
		List<WebElement> searchResults = driver.findElements(By.xpath("//*[@id='Alh6id']/div[1]/div/ul/li"));
		
		//int positon=0;
		for (WebElement webElement : searchResults) {
			String result = webElement.getText();
			
			/*
			 * positon++; if (positon==3) { webElement.click(); break; }
			 */
			
			if (result.contains("cast")) {
				webElement.click();
				break;
			}
		}

	}

}
