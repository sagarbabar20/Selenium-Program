package typesofsxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsByAttribute 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", 
			"C:\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	System.out.println("Browser is open");
	
	driver.manage().window().maximize();
	System.out.println("Browser is Maximize");
	
	driver.get("https://www.saucedemo.com/");
	System.out.println("URL is opened");
	
	driver.findElement(By.xpath("//input[contains(@placeholder,'Username')]")).sendKeys("standard_user");
	
	driver.findElement(By.xpath("//input[contains(@data-test,'password')]")).sendKeys("secret_sauce");
	
	driver.findElement(By.xpath("//input[contains(@value,'Login')]")).click();
	
	System.out.println("Login is Successful");
}
}
