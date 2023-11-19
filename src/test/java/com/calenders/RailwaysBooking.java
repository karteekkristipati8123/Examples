package com.calenders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RailwaysBooking {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		try {
            // Navigate to the IRCTC website
            driver.get("https://www.irctc.co.in/");

            // Locate and click the "OK" button on any pop-up (if present)
//            WebElement popupOKButton = driver.findElement(By.xpath("//button[contains(text(),'OK')]"));
//            if (popupOKButton.isDisplayed()) {
//                popupOKButton.click();
//            }

            // Locate the date picker element and click it
            WebElement datePicker = driver.findElement(By.xpath("//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"));
            datePicker.click();

            // Select a specific date (replace "dd/mm/yyyy" with your desired date)
            String desiredDate = "26/09/2023";
            WebElement dateToSelect = driver.findElement(By.xpath("//td[contains(text(),'" + desiredDate + "')]"));
            dateToSelect.click();

            // You can perform other actions on the page as needed

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the WebDriver
            driver.quit();
        }

	}

}
