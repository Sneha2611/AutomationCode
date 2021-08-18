package com.test;

import org.testng.annotations.Test;

public class ExpectedExceptionTest {

	@Test(expectedExceptions = NumberFormatException.class)
	public void test()
	{
		String s = "100x";
		Integer.parseInt(s);
	}
	
}
