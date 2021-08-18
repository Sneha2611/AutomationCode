package SikuliTest.SikuliTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class TestSikuli {

	public static void main(String[] args) throws FindFailed {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sneha\\Downloads\\Selenium\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(
				"https://www.youtube.com/watch?v=yfDe8BD2dHA");
		
		
		Screen s =new Screen();
		Pattern pauseImg = new Pattern("youtube_settings.png");
		s.wait(pauseImg,2000);
		s.click();

	}

}
