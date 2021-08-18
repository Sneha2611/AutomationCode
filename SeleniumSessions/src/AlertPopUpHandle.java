import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sneha\\Downloads\\Selenium\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		String text = alert.getText();
		
		if(text.equals("Please enter a valid user name"))
		{
			System.out.println("Text is matching");
		}
		else
		{
			System.out.println("Text is not matching");
		}
		
		alert.accept();
		//alert.dismiss();
		
		driver.findElement(By.id("login1")).sendKeys("sneha");
		
		driver.findElement(By.name("proceed")).click();
		alert.accept();
		
		System.out.println(text);
		
		

	}

}
