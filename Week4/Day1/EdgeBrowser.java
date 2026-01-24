package week4.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class EdgeBrowser extends ChromeBrowser {

	public void launchBrowser() {
		System.out.println("Edge browser launched");
		super.launchBrowser();
	}

	public static void main(String[] args) {
        EdgeBrowser edgeOpt = new EdgeBrowser();
		edgeOpt.launchBrowser();

	}
}
