package LearnBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_08 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pwaha\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		WebElement simpleButton = driver.findElement(By.name("j_idt88:j_idt91"));
		simpleButton.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement confirmButton = driver.findElement(By.name("j_idt88:j_idt93"));
		confirmButton.click();
		
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
		
		WebElement promptButton = driver.findElement(By.name("j_idt88:j_idt104"));
		promptButton.click();
		
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("Jupiter");
		alert2.accept();
		
		
		driver.quit();
		
		
	}

}
