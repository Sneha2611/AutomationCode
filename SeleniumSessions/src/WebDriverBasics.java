import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.FF browser
		
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sneha\\Downloads\\Selenium\\geckodriver-v0.29.1-win64\\geckodriver.exe");
//		WebDriver driver  =  new FirefoxDriver(); //launch ff browser
//		driver.get("https://google.com");
		
		
		
		//2.Chrome browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sneha\\Downloads\\Selenium\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		String str = driver.getTitle();
		System.out.println(str);
		
		
		if(str.equals("Google"))
		{
			System.out.println("Correct title");
		}
		else
		{
			System.out.println("Incorrect title");
		}

		
		driver.quit();
		
	}

}
