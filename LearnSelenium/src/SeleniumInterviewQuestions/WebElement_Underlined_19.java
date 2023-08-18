package SeleniumInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class WebElement_Underlined_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pwaha\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in");
		
		WebElement tamil = driver.findElement(By.linkText("தமிழ்"));
		String beforeHovering = tamil.getCssValue("text-decoration");
		System.out.println("Before Hovering " + beforeHovering);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(tamil);
		actions.perform();
		
		String afterHovering = tamil.getCssValue("text-decoration");
		System.out.println("After Hovering " + afterHovering);

	}

}
