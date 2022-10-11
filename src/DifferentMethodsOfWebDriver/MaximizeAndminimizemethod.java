package DifferentMethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeAndminimizemethod 
{
	public static void main(String[] args) throws InterruptedException
	{
		
	System.setProperty("webdriver.chrome.driver",
			"C:\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
//	driver.manage().window().maximize();
	
//	driver.manage().window().minimize();
	
	Thread.sleep(10000);
//	driver.close();
	
	driver.quit();
	}
}
