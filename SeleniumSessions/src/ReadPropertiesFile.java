import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.interactions.Actions;

public class ReadPropertiesFile {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties properties = new Properties();
		
		FileInputStream fip = new FileInputStream("C:\\Users\\sneha\\Naveen_automation\\SeleniumSessions\\src\\config.properties");
		
		properties.load(fip);
		
		System.out.println(properties.getProperty("name"));
		System.out.println(properties.getProperty("company_name"));
		
		
		
		
		if(properties.getProperty("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sneha\\Downloads\\Selenium\\chromedriver_win32 (5)\\chromedriver.exe");
			
			driver =new ChromeDriver();
			
			
		}
		else if(properties.getProperty("browser").equals("ff"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\sneha\\Downloads\\Selenium\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			
			driver =new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get(properties.getProperty("url"));
		
		
		driver.findElement(By.xpath(properties.getProperty("sign_in_mouseover_xpath"))).click();
		
		driver.findElement(By.xpath(properties.getProperty("mob_no_xpath"))).sendKeys(properties.getProperty("mob_no"));
		
		driver.navigate().back();
		
		
		
		
		
		
		
		
		
		
	}

}
