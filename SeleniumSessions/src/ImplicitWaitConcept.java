import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sneha\\Downloads\\Selenium\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.makemytrip.com/flights/?gclid=CjwKCAjwx8iIBhBwEiwA2quaqzdajJUs7RQmxRRjHCBolIfqwI-3ZjIxkD_8RMkSRqbrvzhAQTpchhoCgdYQAvD_BwE&cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|RSA|529579609614&s_kwcid=AL!1631!3!529579609614!e!!g!!makemytrip&ef_id=CjwKCAjwx8iIBhBwEiwA2quaqzdajJUs7RQmxRRjHCBolIfqwI-3ZjIxkD_8RMkSRqbrvzhAQTpchhoCgdYQAvD_BwE:G:s");
	
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
