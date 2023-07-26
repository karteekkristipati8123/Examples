package com.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DemoQA {

	@Test
	public void testdropdown() throws InterruptedException {
		WebDriver driver;
		driver = new EdgeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class=' css-yk16xz-control']"));
		driver.findElement(By.xpath("//div[@class=' css-1uccc91-singleValue']")).click();
		
	
	}
	
	
}
