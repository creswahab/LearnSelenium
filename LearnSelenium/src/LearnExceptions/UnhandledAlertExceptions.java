package LearnExceptions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnhandledAlertExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pwaha\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		WebElement simpleButton = driver.findElement(By.name("j_idt88:j_idt91"));
		simpleButton.click();
		
		Alert alert = driver.switchTo().alert();
		
		WebElement confirmButton = driver.findElement(By.name("j_idt88:j_idt93"));
		confirmButton.click();

	}

}
