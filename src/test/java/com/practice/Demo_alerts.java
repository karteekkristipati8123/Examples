package com.practice;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Demo_alerts {

	@Test
	public void alerts() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KARTHIK REDDY\\eclipse-workspace\\demo_project\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\KARTHIK REDDY\\Downloads\\chrome-win64\\chrome.exe");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

		// sample alert
		driver.findElement(By.id("alertBox")).click();
		Alert sAlert = driver.switchTo().alert();
		System.out.println(sAlert.getText());
		sAlert.accept();
		
		// confirm alert with accept
		driver.findElement(By.id("confirmBox")).click();
		Alert confirmAlert_a = driver.switchTo().alert();
		System.out.println(confirmAlert_a.getText());
		confirmAlert_a.accept();
		
		// confirm alert with accept
		driver.findElement(By.id("confirmBox")).click();
		Alert confirmAlert_d = driver.switchTo().alert();
		System.out.println(confirmAlert_d.getText());
		confirmAlert_d.dismiss();
		
		// prompt alert with accept
		driver.findElement(By.id("promptBox")).click();
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("karthik");
		System.out.println(promptAlert.getText());
		promptAlert.accept();
	    
		// prompt alert with dismiss
		driver.findElement(By.id("promptBox")).click();
		Alert promptAlert_d = driver.switchTo().alert();
		promptAlert_d.sendKeys("karthik");
		System.out.println(promptAlert_d.getText());
		promptAlert_d.dismiss();
			    
		
		driver.quit();
	}
	
}
