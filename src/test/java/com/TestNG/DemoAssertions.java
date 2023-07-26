package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAssertions {

	@Test
	public void verifyAssertions() throws InterruptedException
	{
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://github.com/login");
		driver.findElement(By.id("login_field")).sendKeys("karthikkristipati123@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Karthik@github8123");
		driver.findElement(By.name("commit")).click();
		Thread.sleep(5000);
		String Actualtitle =driver.getTitle();
		String ExpectedTitle ="GitHub";
		Assert.assertEquals(Actualtitle, ExpectedTitle);
		String ActualText = driver.findElement(By.xpath("//ul[@class='list-style-none']//a/span[@class='AppHeader-context-item-label  ']")).getText();
		String ExpectedText = "Dashboard";
		Assert.assertEquals(ActualText,ExpectedText);
	}
}
