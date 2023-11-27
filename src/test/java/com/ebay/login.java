package com.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class login {
	@Test
	public static void testlogin() throws InterruptedException {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("/html/body/header/div/ul[1]/li[1]/span/a")).click();
		driver.findElement(By.cssSelector("#userid")).sendKeys("karthikkristipati123@gmail.com");
		driver.findElement(By.id("signin-continue-btn")).click();
		Thread.sleep(5000);
		WebElement pw = driver.findElement(By.xpath("//div[@class='textbox']"));
		pw.sendKeys("Karthik@ebay123");
		driver.findElement(By.id("sgnBt")).click();
		
	}
}
