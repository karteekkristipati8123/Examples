package com.examples;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demosaucelabs {

	@Test
	public void testDemoRemoteWebDriver() throws MalformedURLException, InterruptedException {
		FirefoxOptions browserOptions = new FirefoxOptions();
		browserOptions.setPlatformName("Windows 10");
		browserOptions.setBrowserVersion("latest-1");
		Map<String, Object> sauceOptions = new HashMap();
		sauceOptions.put("username", "oauth-karthikkristipati123-9744f");
		sauceOptions.put("accessKey", "e0eb2dd3-56ef-410f-be76-6d3afbb66154");
		sauceOptions.put("build", "selenium-build-2F7QY");
		sauceOptions.put("name", "demo Smoke Test");
		browserOptions.setCapability("sauce:options", sauceOptions);

		URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps/@16.6022896,77.6397379,6.35z?authuser=0&entry=ttu");
		driver.findElement(By.xpath("//form[@id='XmI62e']/input[@id='searchboxinput']")).sendKeys("Tiruvannamali");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='pzfvzf']/button[@id='searchbox-searchbutton']")).click();
		
		
		
		
		
		
//		driver.get("https://github.com/login");
//		driver.findElement(By.id("login_field")).sendKeys("karthikkristipati123@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Karthik@github8123");
//		driver.findElement(By.name("commit")).click();
//		String Actualtitle =driver.getTitle();
//		String ExpectedTitle ="GitHub · Where software is built";
//		Assert.assertEquals(Actualtitle, ExpectedTitle);
//		String ActualText = driver.findElement(By.xpath("//ul[@class='list-style-none']//a/span[@class='AppHeader-context-item-label  ']")).getText();
//		String ExpectedText = "Dashboard";
//		Assert.assertEquals(ActualText,ExpectedText);
//		Assert.assertEquals(false, driver.findElement(By.xpath("//ul[@class='list-style-none']//a/span[@class='AppHeader-context-item-label  ']")));
//		Thread.sleep(3000);

//		// go to admin tab
//		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[1]/a")).click();

		
		
//		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
//		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("8919798123");
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//input[@id='continue']")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Karthik@amazon8123");
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
//		driver.findElement(By.id("login_field")).sendKeys("karthikkristipati123@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Karthik@github8123");
//		driver.findElement(By.name("commit")).click();
//		Assert.assertEquals(false, driver.findElement(By.xpath("//ul[@class='list-style-none']//a/span[@class='AppHeader-context-item-label  ']")));
		
	}
}
	
	