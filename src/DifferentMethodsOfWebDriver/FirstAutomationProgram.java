package DifferentMethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomationProgram
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://WWW.facebook.com");
	}

}
