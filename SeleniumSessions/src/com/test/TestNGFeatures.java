package com.test;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	
	
	@Test
	public void login()
	{
		System.out.println("log in");
		int a = 10/0;
		
	}

	

	@Test(dependsOnMethods = "login")
	public void testPge1()
	{
		System.out.println("page1");
	}
	
	@Test(dependsOnMethods = "login")
	public void testPage2()
	{
		System.out.println("page2");
	}
	
	
}
