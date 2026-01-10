package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		//Launch the Browser-Chrome
		//ChromeDriver
		
		//Step1: Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//EdgeDriver driver1=new EdgeDriver();
		
		//Step2: Load the url - get
		driver.get("https://www.facebook.com/");
		
		//Step3: Maximize the browser
		driver.manage().window().maximize();
		
		//LastStep: Closing the browser
		driver.close();
		
	}

}
