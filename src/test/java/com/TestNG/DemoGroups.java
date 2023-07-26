package com.TestNG;

import org.testng.annotations.Test;
@Test(groups="registration")
public class DemoGroups {

	@Test(priority=1,groups="Sanity")
	public void test1()
	{
		System.out.println("First Test");
	}
	@Test (priority=2,groups="Smoke")
	public void test2() {
		System.out.println("Test2");
	}
	@Test(priority=3,groups ="Regression")
	public void test3() {
		System.out.println("Test3");
	}
	@Test(priority =4,groups = "bvt")
	public void test4() {
		System.out.println("Test4");
	}
}
