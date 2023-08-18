package SeleniumInterviewQuestions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationElement_30 {

	 
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mdbootstrap.com/docs/b4/jquery/tables/pagination/");
		
		driver.manage().window().maximize();
		
		List<String> nameList = new ArrayList<String>();
		List<WebElement> ListOfNames;
		WebElement nextButton;
		String nextCheck;
		
		int numberOfPagination = driver.findElements(By.xpath("//div[@id='dtBasicExample_paginate']//a")).size();
		System.out.println(numberOfPagination);		
		
		if(numberOfPagination>0) {
			
			do {
					ListOfNames = driver.findElements(By.xpath("//td[@class='sorting_1']"));
		
					for (WebElement name : ListOfNames) 
						{
						nameList.add(name.getText());
						}
		
					nextButton = driver.findElement(By.id("dtBasicExample_next"));
					nextCheck = nextButton.getAttribute("class");
		
					if (!nextCheck.contains("disabled")) 
						{
						nextButton.click();
						}
					else {
							break;
						 }
		
			   }while(true);
		
			}
			else {
			System.out.println("No Pagination");
			}
		
			for (String allNames : nameList) 
				{
					System.out.println(allNames);
				}
	}

}
