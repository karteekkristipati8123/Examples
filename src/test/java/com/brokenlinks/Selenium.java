package com.brokenlinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium {
	@Test
	public void brokenlinks()
	{
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links found"+links.size());
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			try {
					HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection(); 
					connection.connect();
					int responseCode = connection.getResponseCode();
					if(responseCode != 200)
					{
						System.out.println("Broken links found :"+url);
					}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
