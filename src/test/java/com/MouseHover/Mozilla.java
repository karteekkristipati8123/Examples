package com.MouseHover;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mozilla {
	@Test
	public void testmouserhover() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
//		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0\r\n");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("8919798123");
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//input[@id='continue']")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Karthik@amazon8123");
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//*[@id='nav-flyout-accountList']/div[5]")));
		List<WebElement> alllinks = driver.findElements(By.xpath("//div[@id='nav-al-wishlist']"));
		for (WebElement link : alllinks) {
		System.out.println(link.getText()+" "+link.getAttribute("href"));
		}
		Thread.sleep(3000);
	
	}
}
