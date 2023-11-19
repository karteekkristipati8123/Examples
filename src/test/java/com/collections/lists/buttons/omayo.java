package com.collections.lists.buttons;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class omayo {
	//@Test
	public void storebuttons() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		//Navigating to webpage
		driver.get("https://omayo.blogspot.com/");

		// Find all buttons on the webpage
		List<WebElement> buttons = driver.findElements(By.tagName("button"));

		// Store all buttons in a list
		List<String> buttonTexts = new ArrayList();
		for (WebElement button : buttons) {
			buttonTexts.add(button.getText());
		}

		// Print all button texts to the console
		for (String buttonText : buttonTexts) {
			System.out.println(buttonText);
		}

		// Close the browser
		driver.quit();
	}
//	@Test
	public void storetextboxes() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		//Navigating to webpage
		driver.get("https://omayo.blogspot.com/");
		
		// Find all textboxes on the webpage
        List<WebElement> textboxes = driver.findElements(By.tagName("input"));

        // Store all textboxes in a list
        List<String> textboxNames = new ArrayList();
        for (WebElement textbox : textboxes) {
            textboxNames.add(textbox.getAttribute("name"));
        }

        // Print all textbox names to the console
        for (String textboxName : textboxNames) {
            System.out.println(textboxName);
        }

        // Close the browser
        driver.quit();

	}
	
	@Test
	public void storedropdownlists() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		//Navigating to webpage
		driver.get("https://omayo.blogspot.com/");
		 // Find all the dropdown lists (select elements) on the webpage
        List<WebElement> dropdowns = driver.findElements(By.tagName("select"));

        // Print the number of dropdown lists found
        System.out.println("Total dropdown lists on the webpage: " + dropdowns.size());

        // Loop through the dropdown lists and perform actions (e.g., select options)
        for (WebElement dropdown : dropdowns) {
            // Create a Select object for the dropdown
            Select select = new Select(dropdown);

            // You can perform various actions on the dropdown here, such as selecting options
            // For example, to select the first option:
            select.selectByIndex(0);
        }

        // Close the WebDriver
        driver.quit();

	}
}
