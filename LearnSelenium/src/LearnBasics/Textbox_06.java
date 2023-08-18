package LearnBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox_06 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pwaha\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/input.xhtml");

		WebElement sendbox = driver.findElement(By.name("j_idt88:name"));
		sendbox.sendKeys("Wahi");
		
		WebElement appendBox = driver.findElement(By.name("j_idt88:j_idt91"));
		appendBox.sendKeys(" Tamil Nadu");
		
		WebElement disabledBox =driver.findElement(By.name("j_idt88:j_idt93"));
		boolean checkbox = disabledBox.isEnabled();
		System.out.println(checkbox);
		
		WebElement clearBox = driver.findElement(By.name("j_idt88:j_idt95"));
		clearBox.clear();
		
		WebElement retrieveBox = driver.findElement(By.name("j_idt88:j_idt97"));
		String result = retrieveBox.getAttribute("value");
		System.out.println(result);
		
		driver.quit();
	}

}
