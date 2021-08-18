import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementAvailable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sneha\\Downloads\\Selenium\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(
				"https://app.hubspot.com/signup-hubspot/sales?irclickid=WCz2HhSqCxyLTUP26m0YTwY3UkBRMtwsZ2z7240&irgwc=1&mpid=2059568&utm_id=am2059568&utm_medium=am&utm_source=am2059568&utm_campaign=amcid_WCz2HhSqCxyLTUP26m0YTwY3UkBRMtwsZ2z7240_irpid_2059568&hubs_signup-url=www.hubspot.com/products/get-started-am&hubs_signup-cta=getstarted-sales&_conv_v=vi:1*sc:1*cs:1628706892*fs:1628706892*pv:1*seg:{10031564.1}*exp:{}&_conv_s=si:1*sh:1628706891679-0.9312628323450052*pv:1&_ga=2.1186993.109976290.1628706892-1614570617.1628706892");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// 1. isDisplayed----used for all elements to check if it's present or not
//		Boolean b = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
//		System.out.println(b);
//		
//		driver.findElement(By.xpath("//*[@id=\"UIFormControl-1\"]")).sendKeys("sneha");
//		
//		driver.findElement(By.xpath("//*[@id=\"UIFormControl-3\"]")).sendKeys("acharya");
//		
//		driver.findElement(By.xpath("//*[@id=\"UIFormControl-5\"]")).sendKeys("snehaacharya26@yahoo.in");
//		
//		Boolean b1 = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
//		System.out.println(b1);

		// isEnabled()
		// Is the element currently enabled or not? This will generally return true for
		// everything but disabled input elements.

		Boolean b = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		System.out.println(b);

		
		
		/*
		 * driver.findElement(By.xpath("//*[@id=\"UIFormControl-1\"]")).sendKeys("sneha"
		 * );
		 * 
		 * driver.findElement(By.xpath("//*[@id=\"UIFormControl-3\"]")).sendKeys(
		 * "acharya");
		 * 
		 * driver.findElement(By.xpath("//*[@id=\"UIFormControl-5\"]")).sendKeys(
		 * "snehaacharya26@yahoo.in");
		 * 
		 * Boolean b1 =
		 * driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		 * System.out.println(b1);
		 */
		  
		  WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		  
		  String str = button.getAttribute("aria-disabled");
		  
		  
		  boolean isDisabled = str.contains("false");
		  System.out.println(isDisabled);
		  
		  
		  
		  driver.findElement(By.xpath("//*[@id=\"UIFormControl-1\"]")).sendKeys("sneha"
				  );
				  
				  driver.findElement(By.xpath("//*[@id=\"UIFormControl-3\"]")).sendKeys(
				  "acharya");
				  
				  driver.findElement(By.xpath("//*[@id=\"UIFormControl-5\"]")).sendKeys(
				  "snehaacharya26@yahoo.in");
				  
				  
				  WebElement button1 = driver.findElement(By.xpath("//button[@type='submit']"));
				  
				  String str1 = button1.getAttribute("aria-disabled");
				  
				  
				  boolean isEnabled = str1.contains("false");
				  System.out.println(isEnabled);

	}

}
