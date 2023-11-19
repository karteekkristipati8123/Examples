package com.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo_entryAd {
	@Test
	public void entry_Ad() {
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\KARTHIK REDDY\\eclipse-workspace\\Examples\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.linkText("Entry Ad")).click();
		driver.findElement(By.xpath("//p[normalize-space()='Close']")).click();
		
		driver.quit();
		
	}
}
