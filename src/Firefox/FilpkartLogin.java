package Firefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FilpkartLogin 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.gecko.driver", 
			"C:\\chromedriver_win32\\geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver();
	System.out.println("Browser is open");
	
	driver.manage().window().maximize();
	System.out.println("Browser is Maximize");
	
	driver.get("https://www.flipkart.com/");
	System.out.println("URL is opened");
	
	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("7776067870");

	driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Sagar@205");

    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

	
}
}
