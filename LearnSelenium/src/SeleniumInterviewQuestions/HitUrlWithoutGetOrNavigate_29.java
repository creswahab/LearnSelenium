package SeleniumInterviewQuestions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HitUrlWithoutGetOrNavigate_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "https://www.google.co.in";
		
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.location= \' "+url+" \'");

	}

}
