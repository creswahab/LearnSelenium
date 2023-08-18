package LearnBasics;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pwaha\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/button.xhtml");
		
		//1.Button Position
		WebElement postionbut = driver.findElement(By.name("j_idt88:j_idt94"));
		Point point = postionbut.getLocation();
		int xPoint = point.getX();
		int yPoint = point.getY();
		System.out.println("The X Point is "+ xPoint + " The Y Point is "+yPoint);
		
		//2.Color of the button
		WebElement colorbut = driver.findElement(By.name("j_idt88:j_idt96"));
		String backgroundcolor = colorbut.getCssValue("background-color");
		System.out.println("The Color of the button is "+backgroundcolor);
		
		
		//3. Size of the button
		WebElement buttonSize = driver.findElement(By.name("j_idt88:j_idt98"));
		int buttonHeight = buttonSize.getSize().getHeight();
		int buttonWidth = buttonSize.getSize().getWidth();
		System.out.println("The Height of the Button is "+ buttonHeight + 
				" The Width of the Button is "+ buttonWidth);
		
		driver.quit();
	}

}
