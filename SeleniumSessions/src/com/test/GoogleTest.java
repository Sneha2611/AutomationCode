package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sneha\\Downloads\\Selenium\\chromedriver_win32 (5)\\chromedriver.exe");
	
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	
	
	}
	
	
	@Test(priority=2,groups = "title")
	public void testTitle()
	{
		String t = driver.getTitle();
		System.out.println(t);
		
		Assert.assertEquals(t, "Google123", "incorrect title");
	}
	
	
	
	@Test(priority=3,groups = "page")
	public void testLogo()
	{
		boolean b = driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
		System.out.println(b);
		
		Assert.assertTrue(b);
		Assert.assertEquals(b, true);
	}
	
	
	@Test(priority=1,groups = "page")
	public void testLink()
	{
		boolean b1 = driver.findElement(By.linkText("Mail")).isDisplayed();
		System.out.println(b1);
	}
	
	@Test(groups = "none")
	public void test1()
	{
		System.out.println("test1");
	}
	
	
	@Test(groups = "none")
	public void test2()
	{
		System.out.println("test2");
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
