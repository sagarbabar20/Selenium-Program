package DifferentMethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentSyntax 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver_win32\\chromedriver.exe");
		
		//Syntax 1-->upcasting
		//browser open help
//	WebDriver driver = new ChromeDriver();
	
	//get method is of web driver
	//action on browser
//	driver.get("https://www.facebook.com/");
		
//**********************************************************	
		
	//Syntax 2-->possible
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	
		
	}

}
