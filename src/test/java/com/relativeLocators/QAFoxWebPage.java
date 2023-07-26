package com.relativeLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class QAFoxWebPage {
	@Test
	public void testRelativeLocators() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		By submit = RelativeLocator.with(By.xpath("//div[@class='widget-content']/button[contains(text(),'Submit')]")).toLeftOf(By.xpath("//div[@class='widget-content']/button[contains(text(),'Login')]"));
		driver.findElement(submit).click();
		
		By username = RelativeLocator.with(By.xpath("//form[@name='login']/input[@name='userid']")).toLeftOf(By.xpath("//form[@name='login']/input[@name='pswrd']"));
		driver.findElement(username).sendKeys("karthikkristipati123@gmail.com");
		By password = RelativeLocator.with(By.xpath("//form[@name='login']/input[@name='pswrd']")).toLeftOf(By.xpath("//form[@name='login']/input[@value='Login']"));
		driver.findElement(password).sendKeys("Karthik@qafox123");
	}
}
