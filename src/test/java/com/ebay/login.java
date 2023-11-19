package com.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class login {
	@Test
	public static void testlogin() {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("/html/body/header/div/ul[1]/li[1]/span/a")).click();
		driver.findElement(By.cssSelector("#userid")).sendKeys("karhikkristipati123@gmail.com");
		driver.findElement(By.id("signin-continue-btn")).click();
		
	}
}
