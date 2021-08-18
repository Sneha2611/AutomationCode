import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sneha\\Downloads\\Selenium\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(
				"https://www.jquery-az.com/boots/demo.php?ex=14.0_1");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//button[@class='dropdown dropdown-toggle']")).click();;
		
		//ul[@class='dropdown-menu']//li//a
		
		
		List<WebElement> list1 = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li//a"));
		driver.navigate().refresh();
		
		
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i).getText());
			
			if(list1.get(i).getText().contains("CSS"))
			{
				list1.get(i).click();
				break; 
			}
		}
		
		

	}

}
