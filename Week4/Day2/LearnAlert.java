package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		       // Launch the browser
				ChromeDriver driver = new ChromeDriver();

				// Load the url
				driver.get("https://leafground.com/alert.xhtml");

				// Maximize the browser
				driver.manage().window().maximize();

				// Add implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//click show button
				driver.findElement(By.xpath("//span[text()='Show']")).click();
				
				//change the focus
				Alert simpleAlert = driver.switchTo().alert();
				simpleAlert.accept();
				
				//click show button
				driver.findElement(By.xpath("//button[@name='j_idt88:j_idt104']/span[text()='Show']")).click();
				
				//change the focus
				Alert promptAlert = driver.switchTo().alert();
				
				//getText
				String text = promptAlert.getText();
				System.out.println(text);
				
				//sendKeys
				promptAlert.sendKeys("Vineeth");
				
				//acceptMethod
				promptAlert.accept();
				
		}

}
