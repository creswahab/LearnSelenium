package LearnBasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pwaha\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/window.xhtml");
		
		//1.
		String oldWindow = driver.getWindowHandle();
		
		WebElement confirmWindow = driver.findElement(By.name("j_idt88:new"));
		confirmWindow.click();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for (String newWindow : allWindows) {
			driver.switchTo().window(newWindow);
		}
		
		String windowTitle = driver.getTitle();
		
		if (windowTitle.contains("Dashboard")) {
			System.out.println("The New Window is opened");
		}
		
		driver.switchTo().window(oldWindow);
		
		//2.
		WebElement multipleWindows = driver.findElement(By.name("j_idt88:j_idt91"));
		multipleWindows.click();
		
		Set<String> windowCount = driver.getWindowHandles();
		
		int totalWindows = windowCount.size();
		
		System.out.println("The Total Number of Windows are "+totalWindows);
		
		//3.
		WebElement closeWindows = driver.findElement(By.name("j_idt88:j_idt93"));
		closeWindows.click();
		
		Set<String> countOfWindows = driver.getWindowHandles();
		
		for (String newWindow : countOfWindows) {
			if(!newWindow.equals(oldWindow)) {
				driver.switchTo().window(newWindow);
				driver.close();
			}
		}

	}

}
