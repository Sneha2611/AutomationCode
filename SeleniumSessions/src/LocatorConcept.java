import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sneha\\Downloads\\Selenium\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/contact-sales/");
		
		//1.Using xpath
		driver.findElement(By.xpath("//*[@id=\"Form_submitForm_FirstName\"]")).sendKeys("sneha");
		
		//2.using id
		driver.findElement(By.id("Form_submitForm_LastName")).sendKeys("scharya");;
		
		//3.using name
		driver.findElement(By.name("CompanyName")).sendKeys("Google");
		
		//4.using css selector
		driver.findElement(By.cssSelector("#Form_submitForm_JobTitle")).sendKeys("Automation Engineer");
		
		//5.using classname
		//driver.findElement(By.className("email text required")).sendKeys("abc@gmail.iu");
		
		//6.using linktext 
		//driver.findElement(By.linkText("Resources")).click();
		
		//String img1 = driver.findElement(By.tagName("img")).getText();
		
		//System.out.println(img1);
		
		driver.findElement(By.id("Form_submitForm_Contact")).sendKeys("9898989898");
		driver.findElement(By.id("Form_submitForm_Email")).sendKeys("abc@dsdjk.ci");
		driver.findElement(By.id("Form_submitForm_Comment")).sendKeys("Hiiiiiiiiiiiii");
		
		
		
		Select select = new Select(driver.findElement(By.id("Form_submitForm_Country")));
		select.selectByVisibleText("Denmark");
		
		Select select1 = new Select(driver.findElement(By.id("Form_submitForm_NoOfEmployees")));
		select1.selectByVisibleText("16 - 20");
		
		//driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[4]")).click();
		
		
		
		
		
		
		
		
		
		
		//*[@id="Form_submitForm_FirstName"]
		

	}

}
