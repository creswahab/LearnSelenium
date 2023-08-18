package LearnBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pwaha\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		WebElement progLang = driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[3]/div/div[2]"));
		progLang.click();
		
		WebElement toggleSwitch = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt100\"]/div[2]"));
		toggleSwitch.click();
		

		WebElement SelectedCheck = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt102\"]"));
		boolean check1 =  SelectedCheck.isSelected();
		System.out.println(check1);
		
		driver.quit();
	}

}
