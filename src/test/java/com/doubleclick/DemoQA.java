package com.doubleclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoQA {
	@Test
	public void testDemoQA() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement email_txtbox= driver.findElement(By.id("userEmail"));
		email_txtbox.sendKeys("karthikkristipati123@gmail.com");
		Actions ac = new Actions(driver);
		ac.doubleClick(email_txtbox).build().perform();
		Thread.sleep(5000);
		driver.close();
		driver.quit();
		
	}
}
