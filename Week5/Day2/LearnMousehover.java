package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMousehover {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("https://www.pvrcinemas.com/");

		// Maximize the browser
		driver.manage().window().maximize();

		// Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Step1: Create Object
		Actions act = new Actions(driver);

		// Step2:Locate the element
		WebElement mousehoveElement = driver.findElement(By.xpath("//span[text()='More']"));

		// Step3: use method - moveToElement
		act.moveToElement(mousehoveElement).perform();

	}

}
