import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//htmlunitdriver not avaialable in selenium 3.x version
		//download jar with dependencies
		
		//Advt:
		//1. testing is happening behind the scenes- no browser is launched
		//2. very fast -- execution of the test cases and performance of the script
		//3. not suitable for action class - mouseover, doubleclicketc
		//ghost driver
		//cab be used smoke ,sanity testing
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sneha\\Downloads\\Selenium\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver = new HtmlUnitDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in");
		
		System.out.println("before clickin, title is : "+driver.getTitle());
		
		driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_3']")).click();
		
		Thread.sleep(3000);
		System.out.println("after clickin, title is : "+driver.getTitle());

	}

}
