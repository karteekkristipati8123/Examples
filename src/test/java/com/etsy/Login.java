package com.etsy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	@Test
	public static void testlogin() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KARTHIK REDDY\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.etsy.com/");
		driver.findElement(By.xpath("//div[@class='wt-flex-shrink-xs-0']/nav/ul/li/button")).click();
//		Alert alt = driver.switchTo().alert();
		driver.findElement(By.xpath("//*[@id=\"join_neu_email_field\"]")).sendKeys("karthikkristipati123@gmil.com");
		
		
		
		
		
	}
}
