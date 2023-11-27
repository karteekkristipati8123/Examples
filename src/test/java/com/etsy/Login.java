package com.etsy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	@Test
	public static void testlogin() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KARTHIK REDDY\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.etsy.com/");
		Thread.sleep(4000);
		String pagetitle = driver.getTitle();
		
		//Get the main window handle
		String mainWindow = driver.getWindowHandle();

		// Click on the element that triggers the pop-up login window
		WebElement loginButton = driver.findElement(By.xpath("//div[@class='wt-flex-shrink-xs-0']/nav/ul/li/button")); // Replace with your element locator
		loginButton.click();

		// Get all window handles
		Set<String> windowHandles = driver.getWindowHandles();

		// Switch to the login window
		for (String windowHandle : windowHandles) {
		    if (!windowHandle.equals(mainWindow)) {
		        driver.switchTo().window(windowHandle);
		        break;
		    }
		}
		Thread.sleep(4000);
		// Now you're in the login window, locate the username and password fields and login button
		WebElement usernameField = driver.findElement(By.xpath("//input[@name='email']")); // Replace with your element locator
		WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']")); // Replace with your element locator
		WebElement loginSubmitButton = driver.findElement(By.xpath("//button[@value='sign-in']")); // Replace with your element locator

		// Enter login credentials
		usernameField.sendKeys("karthikkristipati123@gmail.com");
		passwordField.sendKeys("Karthik@etsy8123");

		// Click on the login/submit button
		loginSubmitButton.click();

		// Switch back to the main window
		driver.switchTo().window(mainWindow);
		Thread.sleep(5000);
		// Now you're back in the main window, continue with your tests
		
		//Assert.assertEquals(pagetitle,"Etsy India - Shop for handmade, vintage, custom, and unique gifts for everyone");
		
		driver.findElement(By.xpath("//form[@id='gnav-search']//div//div/input")).sendKeys("Mid Century Round Coffee Table , Scandinavian Coffee Table , Walnut Wood Sofa Table");
		driver.findElement(By.xpath("//button[@data-id='gnav-search-submit-button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='wt-display-flex-xs wt-no-wrap ']//div//button")).click();
		Set<String> windowhandles=driver.getWindowHandles();
		Iterator<String>iterator =windowhandles.iterator();
		String parentwindow = iterator.next();
		String childwindow =iterator.next();
		driver.switchTo().window(childwindow);

//		Set<String> windowHandles1 = driver.getWindowHandles();
//
//		// Switch to the login window
//		for (String windowHandle : windowHandles1) {
//		    if (!windowHandle.equals(mainWindow)) {
//		        driver.switchTo().window(windowHandle);
//		        break;
//		    }
//		}
		Thread.sleep(5000);
		driver.findElement(By.name("free_shipping")).click();
		driver.findElement(By.id("shop-location-input-1")).click();
		driver.findElement(By.id("max-processing-days-1")).click();
		Thread.sleep(3000);
		driver.switchTo().window(mainWindow);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@aria-label='You with 0 notifications']//span[@class='wt-icon wt-menu__trigger__caret']//*[name()='svg']")).click();
		driver.findElement(By.xpath("//ul[@class='wt-list-unstyled']//li/a/div/p[contains(text(),'Sign out')]")).click();
		
	}
}
