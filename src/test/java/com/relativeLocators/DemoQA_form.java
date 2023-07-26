package com.relativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class DemoQA_form {
	@Test
	public void  practiceRelative_Locators() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(4000);
		By firstname = RelativeLocator.with(By.id("firstName")).above(By.id("userEmail"));
		driver.findElement(firstname).sendKeys("Kristipati");
		By lastname = RelativeLocator.with(By.id("lastName")).above(By.id("userEmail"));
		driver.findElement(lastname).sendKeys("Karteek Reddy");
		By email =RelativeLocator.with(By.id("userEmail")).below(By.id("firstName"));
		driver.findElement(email).sendKeys("karthikkristiipati123@gmail.com");
		Thread.sleep(4000);
//		By male = RelativeLocator.with(By.id("gender-radio-1")).toRightOf(By.id("gender-radio-2"));
//		driver.findElement(male).click();
//		Thread.sleep(4000);
//		By female = RelativeLocator.with(By.id("gender-radio-2")).toLeftOf(By.id("gender-radio-1"));
//		driver.findElement(female).click();
		Thread.sleep(4000);
		By reading = RelativeLocator.with(By.id("hobbies-checkbox-2")).near(By.id("hobbies-checkbox-3"));
		driver.findElement(reading).click();
		
	}
}
