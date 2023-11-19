package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Dropdown {

	@Test
	public void dd() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KARTHIK REDDY\\eclipse-workspace\\demo_project\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\KARTHIK REDDY\\Downloads\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		// drop down with select tag
//		driver.get("https://omayo.blogspot.com/");
//		WebElement dd=driver.findElement(By.xpath("//select[@id='drop1']"));
//		Select sdd = new Select(dd);
//		sdd.selectByIndex(1);
		
		
		//
		driver.get("https://www.booking.com/");
		Thread.sleep(10);
		driver.findElement(By.xpath("//button[@aria-label='Dismiss sign-in info.']")).click();
		 // Find the dropdown input field
        WebElement dropdownInput = driver.findElement(By.xpath("//div[@data-testid='destination-container']")); // Replace with your input field ID

        // Click on the input field to trigger the dropdown options
        dropdownInput.click();

        // Find the list of options
        WebElement dropdownOptions = driver.findElement(By.xpath("//li[@role='option']")); // Replace with your options' CSS selector

        // Find and click on the desired option (e.g., Option 2)
        WebElement option2 = dropdownOptions.findElement(By.xpath("//li[text()='Visakhapatnam']")); // Replace with your desired option
        option2.click();

        // Perform further actions or validations as needed

        // Close the browser
        driver.quit();
		
		
		
		
	}

}
