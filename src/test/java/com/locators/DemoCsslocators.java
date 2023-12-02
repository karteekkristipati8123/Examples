package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DemoCsslocators {

	@Test
	public  void demo() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KARTHIK REDDY\\eclipse-workspace\\Examples\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\KARTHIK REDDY\\Downloads\\chrome-win64\\chrome.exe");
//		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://bstackdemo.com/");
		
		//  with id 
		driver.findElement(By.cssSelector("a[id='offers']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("a#offers")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("#offers")).click();
		driver.navigate().back();
	}
	
}
