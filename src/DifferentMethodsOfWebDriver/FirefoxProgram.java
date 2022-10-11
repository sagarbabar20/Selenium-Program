package DifferentMethodsOfWebDriver;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxProgram 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.gecko.driver",
			"C:\\chromedriver_win32\\geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.facebook.com/");
}
}
