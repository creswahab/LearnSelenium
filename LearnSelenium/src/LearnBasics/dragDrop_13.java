package LearnBasics;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class dragDrop_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pwaha\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/drag.xhtml");
		
		driver.manage().window().maximize();
		
		WebElement draggable = driver.findElement(By.id("form:drag"));
		
		WebElement droppable = driver.findElement(By.id("form:drop"));
		
		Actions actions = new Actions(driver);
		actions.clickAndHold(draggable).moveToElement(droppable).build().perform();
		
	}

}
