package guviTask15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {

	public static void main(String[] args) {

		try {
			// Create a new instance of the Chrome driver
			WebDriver driver = new ChromeDriver();

			// Navigate to Google
			driver.get("https://www.google.com");

			// Find the search box using the name attribute and enter the search query
			driver.findElement(By.name("q")).sendKeys("Selenium Browser Driver");

			// Submit the search form
			driver.findElement(By.name("q")).submit();

			// Wait for 5 seconds
			Thread.sleep(5000);
			
			// Print the page title to the console
			System.out.println("Title of page : " + driver.getTitle());
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

// Output :
//	 Title of page : Selenium Browser Driver - Google Search
	
