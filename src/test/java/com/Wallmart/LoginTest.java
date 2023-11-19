package com.Wallmart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LoginTest {
	@Test
	
	public static void login() {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://www.walmart.com/");
		driver.findElement(By.xpath("//a[@link-identifier='Account']")).click();
		driver.findElement(By.xpath("//div[@class='pa4']/button")).click();
		
	}
}
