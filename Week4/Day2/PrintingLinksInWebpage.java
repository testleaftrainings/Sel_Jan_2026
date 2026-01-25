package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PrintingLinksInWebpage {

	public static void main(String[] args) {
		
       // Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("https://www.facebook.com/");

		// Maximize the browser
		driver.manage().window().maximize();

		// Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Count the number of Links & Print the links
		
		//To get the text from the webelement -getText
		WebElement createNewAcc = driver.findElement(By.linkText("Create new account"));
		String textOnElement = createNewAcc.getText();
		System.out.println("Text on createNewAccButton is "+textOnElement);
		
		
		//To find number of Elements
		List<WebElement> allElements = driver.findElements(By.tagName("a"));
		// 0     1    2                             42
		//[WE1, WE2, WE3,,,,,,,,,,,,,,,,,,,,,,,,,,,WE43]
		
		int totalNumberOfLinks = allElements.size();
		System.out.println("totalNumberOfLinks is: "+totalNumberOfLinks);
		
		//Empty List
		List<String> allElementsText=new ArrayList<String>();
		System.out.println("allElementsText "+allElementsText);
		
		
		for (int i = 0; i < totalNumberOfLinks ; i++) {
			String textOfElement = allElements.get(i).getText();
			//String textOfElement = allElements.get(0).getText();   //textOfElement1
			////String textOfElement = allElements.get(1).getText(); //textOfElement2
			//String textOfElement = allElements.get(42).getText();  //textOfElement43
			//System.out.println(textOfElement);
			allElementsText.add(textOfElement);
			
		}
		
		System.out.println("The List is: "+allElementsText);

	}

}
