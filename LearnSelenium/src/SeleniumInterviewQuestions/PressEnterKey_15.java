package SeleniumInterviewQuestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PressEnterKey_15 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pwaha\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in");
		
		//driver.findElement(By.name("q")).sendKeys("Game of Thrones"+Keys.ENTER);
		
		/*
		 * WebElement searchBox = driver.findElement(By.name("q"));
		 * searchBox.sendKeys("Jupiter"); searchBox.submit();
		 */
		
		//driver.findElement(By.name("q")).sendKeys("Game of Thrones \n");
		
		driver.findElement(By.name("q")).sendKeys("Game of Thrones");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}
