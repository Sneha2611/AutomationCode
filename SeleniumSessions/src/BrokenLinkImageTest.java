import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.URL;

public class BrokenLinkImageTest {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sneha\\Downloads\\Selenium\\chromedriver_win32 (5)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://makemysushi.com");
		
		
		//get the list of all the links and images
		
		List<WebElement> linkslist = driver.findElements(By.tagName("a"));
		linkslist.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("size of full links and images------>"+linkslist.size());
		
		List<WebElement> activelist = new ArrayList<WebElement>();
		
		//iterate linkslist -- exclude all links or images which doesnt have any href attribute
		
		for(int i=0;i<linkslist.size();i++)
		{
			System.out.println(linkslist.get(i).getAttribute("href"));
			
			
			if(linkslist.get(i).getAttribute("href") != null && !linkslist.get(i).getAttribute("href").contains("mailto"))
			{
				activelist.add(linkslist.get(i));
			}
			
			
		}
		
		
		//get the size of active links list
		
		System.out.println("size of active links and images--->"+activelist.size());
		
		//check the href url with httpconnection api
		
		for(int j=0;j<activelist.size();j++)	
		{
			
			HttpURLConnection conn =  (HttpURLConnection)new java.net.URL(activelist.get(j).getAttribute("href")).openConnection();
			
			conn.connect();
			String response = conn.getResponseMessage();  //ok
			conn.disconnect();
			
			System.out.println(activelist.get(j).getAttribute("href")+"---->"+response);
			
		}
		
		
		
		
	}

}
