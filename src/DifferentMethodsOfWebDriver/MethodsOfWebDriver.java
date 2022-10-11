package DifferentMethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfWebDriver 
{
	public static void main(String []args)
	{
		System.setProperty("webderiver.chrome.deriver",
				"C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//method-1
		driver.get("https://www.facebook.com/");
	}

}
