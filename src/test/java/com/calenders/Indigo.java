package com.calenders;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Indigo {
	 static WebDriver driver;
		@Test
		public void testSelectCalendarDate() throws InterruptedException{
			ChromeOptions op = new ChromeOptions();
			op.addArguments("remote-allow-origins=*");
			 driver = new ChromeDriver(op);
			driver.manage().window().maximize();
			driver.get("https://www.goindigo.in/");
			driver.findElement(By.xpath("//*[@id='container-fabdaf897e']/div/div[1]/div/div/section/div/div[1]/div[1]/button/text()")).click();
			JavascriptExecutor j = (JavascriptExecutor) driver;
			j.executeScript("return document.readyState").toString().equals("complete");
			driver.findElement(By.xpath("//div[@class='react-datepicker-wrapper']//input[@placeholder='Travel Dates']")).click();
			selectDate("July", "20");
			driver.findElement(By.xpath("//div[@class='custom-form-control input-text-field to-date']//div/input[@placeholder='Add return trip']")).click();
			selectDate("July", "28");

		}

		public static void selectDate(String month, String date) {
			String date_xpath = "//div[@class='css-1dbjc4n r-1euycsn']//div[@data-testid='undefined-month-" + month
					+ "-2023']//div[@data-testid='undefined-calendar-day-" + date + "']";
			
					driver.findElement(By.xpath(date_xpath)).click();
		}
}
