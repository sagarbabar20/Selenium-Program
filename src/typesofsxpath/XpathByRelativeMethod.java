package typesofsxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByRelativeMethod
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
		
		WebElement username=driver.findElement(By.xpath("//form//div[1]//input"));
		username.sendKeys("standard_user");
		
		WebElement password=driver.findElement(By.xpath("//form//div[2]//input"));
		password.sendKeys("secret_sauce");

		WebElement loginbutton=driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input"));
		loginbutton.click();
		
		
	}

}
