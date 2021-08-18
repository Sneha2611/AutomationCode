import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sneha\\Downloads\\Selenium\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.canva.com/en_gb/?irgwc=1&utm_medium=affiliate&utm_source=HKMEDIA&clickId=w1NToJSqIxyLUEQVtuydD0F3UkBRuuyIZ2zq2g0");
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.id("__a11yId2"))).build().perform();
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//*[@id=\"__a11yId3\"]/div/div/div/div[1]/ul/li[3]/a/div/span")).click();;
	
		Thread.sleep(5000);
	}

}
