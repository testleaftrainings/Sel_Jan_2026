package week5.day1;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebtables {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("https://leafground.com/table.xhtml");

		// Maximize the browser
		driver.manage().window().maximize();

		// Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Locate the table
		// To count the number of rows
		List<WebElement> allrows = driver
				.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));
		int numberOfRows = allrows.size();
		System.out.println("numberOfRows is " + numberOfRows);

		// To count the number of columns
		List<WebElement> allColumns = driver
				.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']//tbody/tr[1]/td"));
		int numberOfColumns = allColumns.size();
		System.out.println("numberOfColumns is " + numberOfColumns);

		// To print the particular data
		WebElement row2Col1 = driver
				.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']//tbody/tr[2]/td[1]"));

		String textOnrow2Col1 = row2Col1.getText();
		System.out.println("textOnrow2Col1 is " + textOnrow2Col1);

		// To print the entire row2 data
		List<WebElement> row2Data = driver
				.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']//tbody/tr[2]/td"));
		
		for (int i = 0; i < row2Data.size(); i++) {
			String text = row2Data.get(i).getText();
			// String text = row2Data.get(0).getText();
			// String text = row2Data.get(1).getText();
			System.out.println(text);
		}

		// To print the entire data
		List<WebElement> allData = driver
				.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']//tbody/tr/td"));

		for (int i = 0; i < allData.size(); i++) {

			String text = allData.get(i).getText();
			System.out.println(text);

		}

	}

}
