package com.examples;


import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class gmaps {
	@Test
	public static void search() throws InterruptedException, Exception {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps/@16.6022896,77.6397379,6.35z?authuser=0&entry=ttu");
		driver.findElement(By.xpath("//form[@id='XmI62e']/input[@id='searchboxinput']")).sendKeys("Tiruvannamali");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='pzfvzf']/button[@id='searchbox-searchbutton']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@jstcache='33']/button[@id='hArJGc']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@id='directions-searchbox-0']//div/input")).sendKeys("Goa");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@id='directions-searchbox-1']//div/input")).sendKeys("Chennai");
//		Thread.sleep(3000);
//		Robot rb = new Robot();
//
//		rb.keyPress(KeyEvent.VK_ENTER);
//		rb.keyRelease(KeyEvent.VK_ENTER);
////		driver.findElement(By.xpath("//div[@class='pzfvzf']//button")).click();

	}
}
