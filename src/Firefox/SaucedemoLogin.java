package Firefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SaucedemoLogin 
{
	public static void main(String args[])  
	{
		System.setProperty("webdriver.gecko.driver","C:\\chromedriver_win32\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		System.out.println("browser is open");
		
		driver.manage().window().maximize();
		System.out.println("browser is open");

		driver.get("https://www.saucedemo.com/");
		System.out.println("url is open");

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.name("login-button")).click();
		
	}

}
