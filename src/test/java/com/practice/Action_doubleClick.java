package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action_doubleClick {

	@Test
	public void doubleClick() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\KARTHIK REDDY\\eclipse-workspace\\Examples\\drivers\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KARTHIK REDDY\\eclipse-workspace\\demo_project\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\KARTHIK REDDY\\Downloads\\chrome-win64\\chrome.exe");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.findElement(By.tagName("placeholder='Username'")).sendKeys("Admin");
		driver.get("https://github.com/login");
		driver.findElement(By.id("login_field")).sendKeys("karthikkristipati");
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.doubleClick(driver.findElement(By.id("login_field"))).build().perform();
		Thread.sleep(3000);
		
		
	}
}
