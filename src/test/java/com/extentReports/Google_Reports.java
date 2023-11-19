package com.extentReports;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class Google_Reports {
	WebDriver driver;
	static ExtentReports report;
	static ExtentTest test;
	
	@BeforeTest
	public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		report = new ExtentReports("C:\\Users\\KARTHIK REDDY\\eclipse-workspace\\Sample_Testing\\reports\\report.html",true);
				test = report.startTest("Extent report Demo");
		
		driver.get("https://www.google.com/");
	}
	@AfterTest
	public void teardown() {
		driver.close();
		report.endTest(test);
		report.flush();
		
	}
	@Test(priority=1)
	public void validateTitle() {
		
				test.log(LogStatus.INFO, "Test case validateTitle is started");
		String title = driver.getTitle();
		System.err.println(title);
				test.log(LogStatus.PASS, title);
	}
//	@Test(priority=2)
	public void search() throws InterruptedException {
				test.log(LogStatus.PASS, "Test case search is started");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium");
				test.log(LogStatus.WARNING, "User is navigating to serch results page");
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@class='gNO89b']")).click();
		Thread.sleep(6000);
		String title2 =driver.getTitle();
		System.err.println(title2);
				test.log(LogStatus.PASS, title2);
		Thread.sleep(4000);

	}
	
}
