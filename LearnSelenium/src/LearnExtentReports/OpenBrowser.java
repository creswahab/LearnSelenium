package LearnExtentReports;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class OpenBrowser {
	WebDriver driver;
	ExtentReports extentReports;
	ExtentSparkReporter sparkReporter;
	ExtentTest testcase;
	
	@BeforeSuite
	public void beforeStart() {
		extentReports = new ExtentReports();
		sparkReporter = new ExtentSparkReporter("ExtentReport.html");
		extentReports.attachReporter(sparkReporter);
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pwaha\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void openGoogle() throws IOException {
		testcase=extentReports.createTest("Verify Google is opened");
		driver.get("https://www.google.co.in");
		
		String title = driver.getTitle();
		testcase.log(Status.INFO, "Actual Title: "+ title);
		testcase.log(Status.INFO, "Expected Title: "+ "Google");
		testcase.log(Status.INFO, "Verification of Actual and Expected Title");
		if (title.equals("Google")) {
			testcase.log(Status.PASS, "Actual and Expected Result are same");
		} else {
			testcase.log(Status.FAIL, "Actual and Expected Result are different");
			TakesScreenshot screenshot = (TakesScreenshot) driver; 
			File sourcefile = screenshot.getScreenshotAs(OutputType.FILE); 
			File destinationfile = new File("google.png"); 
			FileHandler.copy(sourcefile, destinationfile);
			testcase.addScreenCaptureFromPath("google.png");
		}
	}
	
	@Test
	public void openBing() throws IOException {
		testcase=extentReports.createTest("Verify Bing is opened");
		driver.get("https://www.bing.com");
		
		String title = driver.getTitle();
		testcase.log(Status.INFO, "Actual Title: "+ title);
		testcase.log(Status.INFO, "Expected Title: "+ "Bing");
		testcase.log(Status.INFO, "Verification of Actual and Expected Title");
		if (title.equals("bing")) {
			testcase.log(Status.PASS, "Actual and Expected Result are same");
		} else {
			testcase.log(Status.FAIL, "Actual and Expected Result are different");
			TakesScreenshot screenshot = (TakesScreenshot) driver; 
			File sourcefile = screenshot.getScreenshotAs(OutputType.FILE); 
			File destinationfile = new File("bing.png"); 
			FileHandler.copy(sourcefile, destinationfile);
			testcase.addScreenCaptureFromPath("bing.png");
		}
	
	}
	
	
	@Test
	public void openWikepedia() throws IOException {
		testcase=extentReports.createTest("Verify Wikipedia is opened");
		driver.get("https://www.wikipedia.org");
		
		String title = driver.getTitle();
		testcase.log(Status.INFO, "Actual Title: "+ title);
		testcase.log(Status.INFO, "Expected Title: "+ "Wikipedia");
		testcase.log(Status.INFO, "Verification of Actual and Expected Title");
		if (title.equals("Wikipedia")) {
			testcase.log(Status.PASS, "Actual and Expected Result are same");
		} else {
			testcase.log(Status.FAIL, "Actual and Expected Result are different");
			TakesScreenshot screenshot = (TakesScreenshot) driver; 
			File sourcefile = screenshot.getScreenshotAs(OutputType.FILE); 
			File destinationfile = new File("wikipedia.png"); 
			FileHandler.copy(sourcefile, destinationfile);
			testcase.addScreenCaptureFromPath("wikipedia.png");
		}
	}
		
	@AfterSuite
	public void afterEnd() {
		driver.quit();
		extentReports.flush();
		
		
	}

}
