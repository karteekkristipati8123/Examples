package com.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Amazon {

	@Test	
	public void testdropdown() throws InterruptedException {
		WebDriver driver;
		FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);
         
		driver= new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement dd=driver.findElement(By.id("searchDropdownBox"));
		Select sdd = new Select(dd);
		List <WebElement> sddoptions = sdd.getOptions();
		for (WebElement option : sddoptions) {
			System.out.println(option.getText());
		}
		Thread.sleep(5000);
//		sdd.selectByIndex(4);
		sdd.selectByValue("search-alias=automotive");
		sdd.selectByVisibleText("Appliances");
		
		 String selectedtext = sdd.getFirstSelectedOption().getText();
		 
			System.out.println(selectedtext);
		
		driver.close();
	
	}
}
