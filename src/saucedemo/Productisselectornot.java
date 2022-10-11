package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Productisselectornot 
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
		UserName.sendKeys("standard_user");
		
		WebElement passwprd=driver.findElement(By.xpath("//input[@id='password']"));
		passwprd.sendKeys("secret_sauce");

		WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
		Thread.sleep(3000);
		
		String homepageurl=driver.getCurrentUrl();
		System.out.println(homepageurl);

		WebElement bag=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
		bag.click();
		 
		String afterclickingbag=driver.getCurrentUrl();
		System.out.println(afterclickingbag);
		
		if(homepageurl.equals(afterclickingbag))
		{
			System.out.println("tc is fail");
		}
		else
		{
			System.out.println("tc is pass");

		}
		
		Thread.sleep(10000);
		
		driver.quit();
		
		System.out.println("end of program");
		
		



}
}