package LearnBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlinks_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pwaha\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/link.xhtml");
		
		WebElement homepage1 = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/a"));
		homepage1.click();
		
		driver.navigate().back();
		
		WebElement whereToGo = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[2]/div/div/a"));
		String toGo = whereToGo.getAttribute("href");
		System.out.println(toGo);
		
		WebElement brokenLink = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[3]/div/div/a"));
		brokenLink.click();
		
		if(driver.getTitle().contains("404")) {
			System.out.println("The Link is broken");
			
		}
		driver.navigate().back();
		
		WebElement homepage2 = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[2]/div[1]/div/div/a"));
		homepage2.click();
		
		driver.navigate().back();
		
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		int alllinks = totalLinks.size();
		System.out.println("The Total Links are "+alllinks);
	}
	
}
