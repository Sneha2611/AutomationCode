package com.test;

import org.testng.annotations.Test;

public class InvocationCountTest {

	
	@Test(invocationCount = 10)
	public void test()
	{
		int a=10,b=10,c;
		c=a+b;
		System.out.println(c);
		
	}
	
}
