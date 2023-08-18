package SeleniumInterviewQuestions;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaximizeTheBrowser_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pwaha\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.get("https://www.google.co.in");
		
		//driver.manage().window().maximize();
		
		//Dimension dimension = new Dimension(1366, 766);
		
		//.manage().window().setSize(dimension);

	}

}
