package com.TestNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class DemoskipTest {
	Boolean datasetup=false;
	@Test(enabled = false)
	public void test1() {
		System.out.println("skipping the first test");
	}
	
	@Test
	public void test2() {
		System.out.println("skipping the second test forcefully");
		throw new SkipException("Skipping the second test");
	}
	
	@Test
	public void test3()
	{
		System.out.println("skkiping this test based on condition");
		if(datasetup==true) {
			System.out.println("Execute the test");
		}else
		{
			System.out.println("Don't execute the test");
			throw new SkipException("Donot execute the test");
		}
	}
}
