package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleAfterLogout 
{
	public static void main(String[] args) throws InterruptedException 	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is Maximize");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is opened");

		WebElement UserName=driver.findElement(By.xpath("//input[@id='user-name']"));
		UserName.sendKeys("standard_user");
		
		WebElement passwprd=driver.findElement(By.xpath("//input[@id='password']"));
		passwprd.sendKeys("secret_sauce");

		WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
		 
       WebElement clickonleftsidethreelines= driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
       clickonleftsidethreelines.click();
       Thread.sleep(2000);
       
       WebElement logoutbutton= driver.findElement(By.xpath("//a[text()='Logout']"));
       logoutbutton.click();

       
       String Title=driver.getTitle();
       System.out.println(Title);

	}

}
