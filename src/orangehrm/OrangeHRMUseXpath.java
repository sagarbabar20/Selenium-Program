package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMUseXpath 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", 
			"C:\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	System.out.println("Browser is open");
	
	driver.manage().window().maximize();
	System.out.println("Browser is Maximize");
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	System.out.println("URL is opened");
	Thread.sleep(3000);
	
	WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
	username.sendKeys("Admin");
	
	WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys("admin123");

	WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
	loginbutton.click();

	

}
}
