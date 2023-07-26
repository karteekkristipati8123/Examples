package com.examples;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import com.google.common.io.Files;

public class DemoScreenShot {
	@Test
	public void testScreenshot() throws IOException
	{
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testng.org/doc/");
		File screenshotfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(screenshotfile, new File("C:\\Users\\KARTHIK REDDY\\Pictures\\Screenshots\\TestNG.jpg"));
		DateFormat dateFormat2 = new SimpleDateFormat("dd-MMM-yyyy hh.mm aa");
		String dateString2 = dateFormat2.format(new Date()).toString();
		System.out.println("time :  "+dateString2);
	}
}
