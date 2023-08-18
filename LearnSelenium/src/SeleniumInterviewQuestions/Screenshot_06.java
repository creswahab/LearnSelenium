package SeleniumInterviewQuestions;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_06 {

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pwaha\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		WebElement simpleButton = driver.findElement(By.name("j_idt88:j_idt91"));
		simpleButton.click();
		
		
		
		/*
		 * TakesScreenshot screenshot = (TakesScreenshot) driver; File sourcefile =
		 * screenshot.getScreenshotAs(OutputType.FILE); File destinationfile = new
		 * File("C:\\Users\\pwaha\\testresult1.png"); FileHandler.copy(sourcefile,
		 * destinationfile);
		 */
		
		Robot robot = new Robot();
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(screensize);
		BufferedImage sourceFile = robot.createScreenCapture(rectangle);
		File destintationFile = new File("C:\\Users\\pwaha\\testresult2.png");
		ImageIO.write(sourceFile,"png", destintationFile);
		
		
		
	}

}
