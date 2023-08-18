package LearnBasics;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile_17 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pwaha\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/file.xhtml");
		
		WebElement downloadButton = driver.findElement(By.name("j_idt93:j_idt95"));
		downloadButton.click();
		
		Thread.sleep(3000);
		
		File filelocation = new File("C:\\Users\\pwaha\\Downloads");
		File[] files = filelocation.listFiles();
		
		for (File file : files) {
			if (file.getName().equals("TestLeaf Logo.png")) {
				System.out.println("The File is downloaded");
				break;
			}
		}
	}

}
