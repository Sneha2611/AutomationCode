import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sneha\\Downloads\\Selenium\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(
				"https://money.rediff.com/gainers/bsc/daily/groupa");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//*[@id="leftcontainer"]/table/tbody/tr[1]/td[1]/a     
		//*[@id="leftcontainer"]/table/tbody/tr[2]/td[1]/a   
		//*[@id="leftcontainer"]/table/tbody/tr[3]/td[1]/a
		
		
		//Method 1
		
		/*
		 * String before_xpath = "//*[@id=\"leftcontainer\"]/table/tbody/tr["; String
		 * after_xpath = "]/td[1]/a";
		 * 
		 * for(int i=1 ; i<=566 ; i++) { String name =
		 * driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
		 * //System.out.println(name);
		 * 
		 * if(name.equals("Shoppers Stop")) {
		 * driver.findElement(By.xpath(before_xpath+i+after_xpath)).click(); break; } }
		 */
		
		//Method 2
		
		
		driver.findElement(By.xpath("//div[@id='leftcontainer']/child::table//child::a[contains(text(),'Nelco Ltd')]")).click();;
		
		
		
		
		

	}

}
