package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

	public static void main(String[] args) {
		 // Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("https://leafground.com/window.xhtml");

		// Maximize the browser
		driver.manage().window().maximize();

		// Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click on the Open button
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		//getWindowHandles
		String parentAddress = driver.getWindowHandle();
		System.out.println("parentAddress is: "+parentAddress);
        //0B184148FD23D8200D1E94151183E0FD
		//9661BA9133B6147EF947D3B9CC742291
		
		//getWindowHandles
		Set<String> allAddress = driver.getWindowHandles();
		System.out.println("The set is: "+allAddress);
		//                0                             1
		//[7651C7E708E6A200D36BC43BEC5AB20A, 7E074583BA5CA0E21B796ECA3A432576]
		
		//Convert Set into List
		List<String> address=new ArrayList<String>(allAddress);
		
		String childAddress = address.get(1);
		
		//getTitle
		String parentTitle = driver.getTitle();
		System.out.println("parentTitle is : "+parentTitle);
		
		//transfer the driver focus
		driver.switchTo().window(childAddress);
		
		//getTitle
		String childTitle = driver.getTitle();
		System.out.println("childTitle : "+childTitle);
		
		//close vs quit
		driver.close();
		//driver.quit();
		
		driver.switchTo().window(address.get(0));
		
		String parent = driver.getTitle();
		System.out.println("Parent title is: "+parent);
		
	}

}
