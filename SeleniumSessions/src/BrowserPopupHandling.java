import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserPopupHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sneha\\Downloads\\Selenium\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/sneha/Downloads/Browserpopupex.html");
		
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		
		Set<String> handler = driver.getWindowHandles();
		
		Iterator<String> itr = handler.iterator();
		
		String parentWindowId = itr.next();
		System.out.println("Parent window id : "+parentWindowId);
		
		String childWindowId = itr.next();
		System.out.println("Parent window id : "+childWindowId);
		
		driver.switchTo().window(childWindowId);
		System.out.println("child window title is : "+driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.close(); //close the current browser and quit will close all the browsers
		
		driver.switchTo().window(parentWindowId);
		System.out.println("child window title is : "+driver.getTitle());
		
		

	}

}
