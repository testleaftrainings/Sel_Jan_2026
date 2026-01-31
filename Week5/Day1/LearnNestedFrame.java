package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("https://leafground.com/frame.xhtml");

		// Maximize the browser
		driver.manage().window().maximize();

		// Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//transfer the focus to outer frame
		//driver.switchTo().frame(2);
		WebElement frameElement = driver.findElement(By.xpath("//h5[text()=' Click Me (Inside Nested frame)']/following-sibling::iframe"));
		driver.switchTo().frame(frameElement);
		
		//transfer to inner frame
		//driver.switchTo().frame(0);
		driver.switchTo().frame("frame");
		
		//Click the button
		driver.findElement(By.id("Click")).click();
		
		//switch the focus to main webpage
		driver.switchTo().defaultContent();
		
		//switch back to its immediate parent frame
		driver.switchTo().parentFrame();
		
		

	}

}
