import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.google.common.io.Files;

public class JavaScriptExecutorConcept {
	
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		/*
		 * We can highlight the element in three modes, those are, 
		 * 1.Draw a border for the web element 
		 * 2.Change the background color of the web element 
		 * 3.Draw a border for the web element + Change the background color of the web element
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sneha\\Downloads\\Selenium\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in");
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		case_1(login,driver);
		login.sendKeys("hiiiiiiii");
		
//		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		//copy the ss to desired location using copyFile method
//		Files.copy(src, new File("C:\\Users\\sneha\\Naveen_automation\\SeleniumSessions\\src\\error.png"));
//		
		generateAlert(driver, "There is an error,please check!!!!!");
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		WebElement fashion = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]"));
		clickElementByJS(driver, fashion);
		
		driver.navigate().back();
		
		refreshUsingJS(driver);
		
		System.out.println(getTitleUsingJS(driver));
		
		getInnerPageTextUsingJS(driver);
		
		scrollPageDown(driver);
		
		
		WebElement eossale = driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]"));
		scrollTView(driver, eossale);

	}
	
	
	
	//1.Draw a border for the web element 
	public static void case_1(WebElement element, WebDriver driver)
	{
		
		for(int i=0;i<50;i++)
		{
		JavascriptExecutor jsexecutor = (JavascriptExecutor)driver;
		
		//jsexecutor.executeScript("arguments[0].style.border='2px solid red'", element);
		//jsexecutor.executeScript("arguments[0].style.background='yellow'", element);
		jsexecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
	}
	
	public static void generateAlert(WebDriver driver,String message)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('"+message+"')");
	}
	
	
	public static void clickElementByJS(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js  =  (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}
	
	
	public static void refreshUsingJS(WebDriver driver)
	{
		JavascriptExecutor js  =  (JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
	}
	
	
	public static String getTitleUsingJS(WebDriver driver)
	{
		JavascriptExecutor js  =  (JavascriptExecutor)driver;
		String str = js.executeScript("return document.title").toString();
		return str;
	}
	

	public static void getInnerPageTextUsingJS(WebDriver driver)
	{
		JavascriptExecutor js  =  (JavascriptExecutor)driver;
		String str = js.executeScript("return document.documentElement.innerText").toString();
		System.out.println(str);
	}
	
	
	public static void scrollPageDown(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void scrollTView(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	
}
