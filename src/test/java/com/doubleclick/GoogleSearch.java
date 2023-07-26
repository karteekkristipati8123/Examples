package com.doubleclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class GoogleSearch {

	@Test
	public void testdoubleclick() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement inputText = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		inputText.sendKeys("Selenium");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.doubleClick(driver.findElement(By.xpath("//textarea[@id='APjFqb']"))).build().perform();
		Thread.sleep(2000);
		driver.close();
		driver.quit();

	}
}
