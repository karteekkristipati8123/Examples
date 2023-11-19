package com.examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demoBrokenlinks {
	@Test
	public void brokennlinks()
	{
		System.setProperty("webdriver.chome.driver", "C:\\Users\\KARTHIK REDDY\\eclipse-workspace\\Examples\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/broken_images");
		List<WebElement>images =driver.findElements(By.tagName("img"));
		 for (WebElement image : images) {
	            
	            String imageUrl = image.getAttribute("src");
	            
	            
	            if (imageUrl != null && !imageUrl.isEmpty()) {
	              
	                int responseCode = checkImageURL(imageUrl);
	                
	                if (responseCode != 200) {
	                    System.out.println("Broken Image: " + imageUrl + " (HTTP Status Code: " + responseCode + ")");
	                }
	            }
	        }
		driver.quit();
	}
	
	public static int checkImageURL(String imageUrl)
	{
		return 200;
	}
}
