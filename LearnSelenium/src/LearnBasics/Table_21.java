package LearnBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_21 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pwaha\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/table.xhtml");
		
		List<WebElement> totalColumns = driver.findElements(By.tagName("th"));
		int columnCount = totalColumns.size();
		System.out.println("Columns Count are "+columnCount);
		
		List<WebElement> totalRows = driver.findElements(By.tagName("tr"));
		int rowsCount = totalRows.size();
		System.out.println("Rows Count are "+rowsCount);
		
		WebElement country = driver.findElement(By.xpath("//td[normalize-space()='United Kingdom']//following::td[1]"));
		String showText = country.getText();
		System.out.println(showText);
	}

}
