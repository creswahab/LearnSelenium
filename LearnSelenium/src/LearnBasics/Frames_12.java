package LearnBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pwaha\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.switchTo().frame(0);
		
		WebElement frameText = driver.findElement(By.id("Click"));
		frameText.click();
		
		String framegetText = driver.findElement(By.id("Click")).getText();
		System.out.println(framegetText);
		
		driver.switchTo().defaultContent();
		
		
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		WebElement frameText2 = driver.findElement(By.id("Click"));
		frameText2.click();
		
		driver.switchTo().defaultContent();
		
		
		List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
		int countFrames = totalFrames.size();
		System.out.println("The Total Number of Frames are "+countFrames);
		
	}

}
