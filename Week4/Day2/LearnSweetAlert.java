package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSweetAlert {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("https://leafground.com/alert.xhtml");

		// Maximize the browser
		driver.manage().window().maximize();

		// Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//button[@name='j_idt88:j_idt95']/span[text()='Show']")).click();
		
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
	}

}
