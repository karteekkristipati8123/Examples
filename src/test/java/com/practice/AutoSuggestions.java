
package com.practice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AutoSuggestions {
	@Test
	public static void as() { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KARTHIK REDDY\\eclipse-workspace\\demo_project\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\KARTHIK REDDY\\Downloads\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("karthik");
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='mkHrUc']//ul[@role='listbox']/li"));
		System.out.println(suggestions.size());
		
		for (WebElement suges : suggestions) {
			String ele =suges.getText();
			System.out.println(ele);
		}
	}
}
