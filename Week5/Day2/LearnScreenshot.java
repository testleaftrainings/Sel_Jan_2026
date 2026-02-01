package week5.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnScreenshot {

	public static void main(String[] args) throws IOException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//Step1: Take the Screenshot
		File screenshotSource = driver.getScreenshotAs(OutputType.FILE);
		
		//Step2: Set the Location
		File screenshotDestination=new File("./Snap/leaftaps.png");
		
		//Step3: Pasting the screenshot in the Location
		FileUtils.copyFile(screenshotSource, screenshotDestination);
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");

	}

}
