package com.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoAnnotations {
	@BeforeTest
	public void logintest()
	{
		System.out.println("This is login to application");
	}
	@AfterTest
	public void logout()
	{
		System.out.println("This is logout from application");
	}
	@BeforeMethod
	public void dbconnection() {
		System.out.println("conncected to DB");
	}
	@AfterMethod
	public void dbdisconection()
	{
		System.out.println("disconnceted to DB");
	}
@Test
	public void test1()
	{
		System.out.println("This is first test");
	}
	@Test
	public void test2()
	{
		System.out.println("This is Second test");
	}
	


}
