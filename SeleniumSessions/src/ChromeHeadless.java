import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHeadless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sneha\\Downloads\\Selenium\\chromedriver_win32 (5)\\chromedriver.exe");
		
		ChromeOptions c = new ChromeOptions();
		c.addArguments("window-size=1400,800");
		c.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(c);
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(
				"https://www.jquery-az.com/boots/demo.php?ex=14.0_1");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//button[@class='dropdown dropdown-toggle']")).click();;
		
		//ul[@class='dropdown-menu']//li//a
		
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li//a"));
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().contains("CSS"))
			{
				list.get(i).click();
				break; 
			}
		}
		
		
	}

}
