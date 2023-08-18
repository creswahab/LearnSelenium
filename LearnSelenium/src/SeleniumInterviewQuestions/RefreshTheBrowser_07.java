package SeleniumInterviewQuestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshTheBrowser_07 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pwaha\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		WebElement simpleButton = driver.findElement(By.name("j_idt88:j_idt91"));
	
		//driver.navigate().refresh();
		
		//driver.get(driver.getCurrentUrl());
		
		/*
		 * JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		 * //javascriptExecutor.executeScript("location.reload()");
		 * javascriptExecutor.executeScript("history.go(0)");
		 */

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
	}

}
