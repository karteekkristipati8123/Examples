package com.calenders;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AirIndiaBooking {
	WebDriver driver;
	@Test
	public void testBooking() throws AWTException, InterruptedException
	{
	ChromeOptions op = new ChromeOptions();
	op.addArguments("remote-allow-origins=*");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.airindia.com/");
	JavascriptExecutor j = (JavascriptExecutor) driver;
	j.executeScript("return document.readyState").toString().equals("complete");
	Thread.sleep(3000);
//	driver.findElement(By.cssSelector("#From")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.cssSelector("#ngb-typeahead-0-49 > div > div > div.col-9 > div.row.airport-country-detail")).click();
//	Thread.sleep(3000);
//	
//	driver.findElement(By.xpath("//*[@id='To']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"ngb-typeahead-1-23\"]/div/div/div[2]/div[@title=' Bengaluru, India, IN']")).click();

	driver.findElement(By.xpath("//div[@class='date-field col-6 col-lg-5']")).click();
	Thread.sleep(3000);
	selectDate("July", "06");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='date-field col-6 col-lg-5']//input[@class='btn bi bi-calendar3']")).click();
	Thread.sleep(2000);
	selectDate("July", "10");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='dropdownForm1']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='mat-tab-content-0-0']/div/app-search-flight/div/form/div[1]/app-add-passenger/div/div[2]/div[1]/div[2]/button[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='mat-tab-content-0-0']/div/app-search-flight/div/form/div[1]/app-add-passenger/div/div[2]/div[2]/div[2]/button[2]")).click();
	driver.findElement(By.xpath("//*[@id='mat-tab-content-0-0']/div/app-search-flight/div/form/div[1]/app-add-passenger/div/div[2]/div[2]/div[2]/button[2]")).click();
	driver.findElement(By.xpath("//div[@id='mat-select-value-1']/span/span")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//mat-option[@id='mat-option-3']/span")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@id='mat-select-value-3']/span")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//mat-option[@id='mat-option-0']/span")).click();
	
	}

	public void selectDate(String month, String date) {
		String date_xpath = "//*[@id='mat-tab-content-0-0']/div/app-search-flight/div/form/div[1]/app-datepicker-range-popup/div/div[1]/div[1]/div/ngb-datepicker/div[2]/div[1]/div" + month
				+ "//*[@id='mat-tab-content-0-0']/div/app-search-flight/div/form/div[1]/app-datepicker-range-popup/div/div[1]/div[1]/div/ngb-datepicker/div[2]/div[1]/ngb-datepicker-month/div[3]/div[2]/span" + date + " ']";
		driver.findElement(By.xpath(date_xpath)).click();

	}





}
