package week8.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LearnDependsOnMethods {
    @Test
	public void login() {
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
		driver.findElement(By.id("user")).sendKeys("Demosalesmanager");
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");

		// Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click the button
		driver.findElement(By.className("decorativeSubmit")).click();

	}
    @Test(dependsOnMethods = {"login"})
    public void createLead() {
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

		// Click CRMSFA
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Click the Leads link
		driver.findElement(By.linkText("Leads")).click();

		// Click on the Create lead button
		driver.findElement(By.linkText("Create Lead")).click();

		// Enter the companyname
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");

		// Enter the firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");

		// Enter the lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");

		// Step1: Find the Element
		// String name="Vineeth";
		WebElement sourceElement = driver.findElement(By.id("createLeadForm_dataSourceId"));

		// Step2: Create Object for Select Class
		Select options = new Select(sourceElement);

		// Step3: Use the method to Select
		// options.selectByIndex(3);
		// options.selectByValue("LEAD_CONFERENCE");
		options.selectByVisibleText("Employee");

		//Thread.sleep(5000);
		// Click create lead button
		driver.findElement(By.name("submitButton")).click();


	}

}
