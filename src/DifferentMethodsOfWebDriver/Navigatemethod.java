package DifferentMethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatemethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver_win32\\chromedriver.exe");
		
		//1.get method-use to open URL
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//2.navigate method-use to open URL
		driver.navigate().to("https://www.facebook.com/");
		
		//3.Back
		driver.navigate().back();
		Thread.sleep(3000);
		
		//4.forward
		driver.navigate().forward();
		Thread.sleep(3000);
		
		//5.refresh
		driver.navigate().refresh();
		
		
	}
	}
