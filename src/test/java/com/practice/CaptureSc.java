package com.practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class CaptureSc {

		@Test
		public static void Screensht() throws IOException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\KARTHIK REDDY\\eclipse-workspace\\demo_project\\drivers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.setBinary("C:\\Users\\KARTHIK REDDY\\Downloads\\chrome-win64\\chrome.exe");
			
			WebDriver driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get("https://www.britishairways.com/travel/home/public/en_gb/");
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			Files.copy(screenshotFile, new File("E:\\images\\britishAirways.jpg"));
			
		}
}
