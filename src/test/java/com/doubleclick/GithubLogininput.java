package com.doubleclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class GithubLogininput {

	@Test
	public void testGithub() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");;
		WebElement loginField = driver.findElement(By.xpath("//input[@id='login_field']"));
		loginField.sendKeys("karthikkristipati123@gmail.com");
		Thread.sleep(2000);
		Actions ac = new  Actions(driver);
		ac.doubleClick(loginField).build().perform();
		driver.close();
		driver.quit();
		
	}
}
