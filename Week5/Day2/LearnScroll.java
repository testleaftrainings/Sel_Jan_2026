package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScroll {

	public static void main(String[] args) {
		// Launch the browser
				ChromeDriver driver = new ChromeDriver();

				// Load the url
				driver.get("https://www.amazon.in/");

				// Maximize the browser
				driver.manage().window().maximize();

				// Add implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				Actions act=new Actions(driver);
				
				WebElement scrollElement = driver.findElement(By.linkText("Conditions of Use & Sale"));

				act.scrollToElement(scrollElement).perform();
				
				scrollElement.click();
				
	}

}
