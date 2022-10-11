package typesofsxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByTextMethod02
{
public static void main(String[] args)  
{
	System.setProperty("webdriver.chrome.driver", 
			"C:\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	System.out.println("Browser is open");
	
	driver.manage().window().maximize();
	System.out.println("Browser is Maximize");
	
	driver.get("https://www.facebook.com/");
	System.out.println("URL is opened");
	
	WebElement forgotpassword=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	forgotpassword.click();
	
//In regular we need to use a complete value of attribute value of HTML text.
	
}
}
