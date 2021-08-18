import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicsearchUsingDynamicXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sneha\\Downloads\\Selenium\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(
				"https://yandex.com");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"text\"]")).sendKeys("java");
		
		//ul[@role='listbox']/li[contains(text(),'javascript')]
		
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']/li[@role='option']"));
			System.out.println(list.size());
			
			for(int i=0 ; i<list.size() ; i++)
			{
				System.out.println(list.get(i).getText());
				
				if(list.get(i).getText().contains("javascript"))
				{
					list.get(i).click();
					break;
				}
				
				
			}
		

	}

}
