package week8.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LearnInvocationCount {
@Test(invocationCount = 3,threadPoolSize = 3)
   public void runLogin() {
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("guest");

	// Launch the browser
	ChromeDriver driver = new ChromeDriver(opt);

	// Load the url
	driver.get("http://leaftaps.com/opentaps");

	// Maximize the browser
	driver.manage().window().maximize();

	// Add implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	// Enter the username
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");

	// Enter the password
	driver.findElement(By.id("password")).sendKeys("crmsfa");

	// Click the button
	driver.findElement(By.className("decorativeSubmit")).click();


}

}
