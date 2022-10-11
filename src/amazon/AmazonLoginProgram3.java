package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLoginProgram3 
{
	public static void main(String[] args)
	{
		
	System.setProperty("webdriver.chrome.driver", 
			"C:\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	System.out.println("Browser is open");
	
	driver.manage().window().maximize();
	System.out.println("Browser is Maximize");
	
	driver.get("https://www.amazon.com/");
	System.out.println("URL is opened");
	
	driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	
    driver.findElement(By.id("ap_email")).sendKeys("7776067870");
	
	driver.findElement(By.id("continue")).click();
	
	driver.findElement(By.id("ap_password")).sendKeys("Sagar@205");
	
    driver.findElement(By.id("signInSubmit")).click();
    
   	}
}
