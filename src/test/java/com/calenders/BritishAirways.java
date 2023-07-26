package com.calenders;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BritishAirways {
	WebDriver driver;
	@Test
	public void testBooking()  
	{
	ChromeOptions op = new ChromeOptions();
	op.addArguments("remote-allow-origins=*");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.britishairways.com/travel/home/public/en_us/");
	driver.findElement(By.xpath("//button[@id='ensCloseBanner']")).click();
	WebElement from =driver.findElement(By.xpath("//div[@class='small-12 columns from-to-field']//div/input[@id='from']"));
	from.sendKeys("Man");
	
	
	}

}
