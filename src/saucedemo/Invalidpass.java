package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalidpass 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", 
			"C:\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	System.out.println("Browser is open");
	
	driver.manage().window().maximize();
	System.out.println("Browser is Maximize");
	
	driver.get("https://www.saucedemo.com/");
	System.out.println("URL is opened");

	WebElement UserName=driver.findElement(By.xpath("//input[@id='user-name']"));
	UserName.sendKeys("standard_use");
	
	WebElement passwprd=driver.findElement(By.xpath("//input[@id='password']"));
	passwprd.sendKeys("secret_auce");

	WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
	loginbutton.click();
	Thread.sleep(3000);
	
	
	WebElement popmsg=driver.findElement(By.xpath("//h3[@data-test='error']"));
	
	String actualtext=popmsg.getText();
	System.out.println(actualtext);
	String expectedresult="Epic sadface: Username and password do not match any user in this service";
	
	if(actualtext.equals(expectedresult))
	{
		System.out.println("test case is pass");
	}
	else
	{
		System.out.println("test case is fail");
	}
	
	Thread.sleep(10000);
	
	driver.quit();
	
	System.out.println("end of program");
	
	
}
}
