package guviTask15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5 {

	public static void main(String[] args) {
		// Create a new instance of the Chrome driver
		WebDriver driver = new ChromeDriver();
		
		// Navigate to the Salesforce login page
		driver.get("https://login.salesforce.com/");
		
		// Locate the username field using the 'id' locator and enter the username
		driver.findElement(By.id("username")).sendKeys("hariharan");
		
		// Locate the password field using the 'name' locator and enter the password
		driver.findElement(By.name("pw")).sendKeys("hari785475");
		
		// Locate the login button using the 'cssSelector' and click it
		driver.findElement(By.cssSelector("input.button")).click();

	}

}
