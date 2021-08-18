import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandlingUsingLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sneha\\Downloads\\Selenium\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(
				"https://www.airindia.in/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//*[@id=\"_depdateeu1\"]")).click();
		
		String date = "20/08/2021";
		String dateArr[] = date.split("/");
		
		
		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];
		
		//*[@id="ui-datepicker-div"]/div[1]/table/tbody/tr[4]/td[2]
		
		String before_xpath = "//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[";
		String after_xpath = "]/td[";
		String dayVal=null;
		final int no_of_days =7;
		boolean flag=false;
		for(int rownum = 1 ; rownum<=5 ; rownum++)
		{
			for(int colnum =1 ; colnum<=no_of_days ; colnum++)
			{
				try
				{
				dayVal = driver.findElement(By.xpath(before_xpath+rownum+after_xpath+colnum+"]")).getText();
				}
				catch(NoSuchElementException e)
				{
					System.out.println("Enter a valid date");
					flag =false;
					break;
				}
				System.out.println(dayVal);
				
				if(dayVal.equals(day))
				{
					driver.findElement(By.xpath(before_xpath+rownum+after_xpath+colnum+"]")).click();
					flag = true;
					break;
				}
				
				
			}
			if(flag)
			{
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		

	}

}
