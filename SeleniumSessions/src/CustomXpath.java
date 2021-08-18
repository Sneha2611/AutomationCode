import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sneha\\Downloads\\Selenium\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.amazon.in/");
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Absolute xpath - not recommended
		//$x("/html/body/div[1]/div/div[1]/a")
		//performance issue
		//not reliable
		//can be changed anytime in the future
		
		//driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("books");
		
		driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]")).sendKeys("books");
		
		//dynamic id
		//id=test_123
		//By.id("test_123")
		
		//start-with
		//id=test_454
		//id=test_8932
		//id=test_test_5374_test
		
		//ends-with
		//id=343_test
		//id=8564_test
		//id=2345_test
		
		
//		driver.findElement(By.xpath("//input[contains(@id,'text_')]")).sendKeys("books");
//		driver.findElement(By.xpath("//input[starts-with(@id,'text_')]")).sendKeys("books");
//		driver.findElement(By.xpath("//input[ends-with(@id,'_text')]")).sendKeys("books");
		
		
		//for links - cuatom xpath
		//all the links are represented by <a> html tag
		
		driver.findElement(By.xpath("//a[contains(text(),'Explore all')]")).click();
		
		
		
		
		
		

	}

}
