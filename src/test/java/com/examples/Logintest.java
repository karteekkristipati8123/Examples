package com.examples;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Logintest extends Base_Test{

		@Test
		public static void verifylogin()
		{
			driver.manage().window().maximize();
			driver.get("https://github.com/login");
			driver.findElement(By.id("login_field")).sendKeys("karthikkristipati123@gmail.com");
			driver.findElement(By.id("password")).sendKeys("Karthik@github8123");
			driver.findElement(By.name("commit")).click();
			Assert.assertEquals(false, driver.findElement(By.xpath("//ul[@class='list-style-none']//a/span[@class='AppHeader-context-item-label  ']")));
		}
}
