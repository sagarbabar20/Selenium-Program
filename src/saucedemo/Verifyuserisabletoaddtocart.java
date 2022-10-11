package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifyuserisabletoaddtocart
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
		
		WebElement addtocart1=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		addtocart1.click();
		
		WebElement basket=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		basket.click();

		WebElement bag=driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]"));

		String beforeselection=bag.getText();
		System.out.println(beforeselection);
		
		WebElement bag1 =driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
		String afterselection=bag1.getText();
		System.out.println(afterselection);
		
		if(beforeselection.equals(afterselection))
		{
			System.out.println("test case is passed");
		}
		else
		{
			System.out.println("test case is failed");

		}
		
		System.out.println("end of program");
		
	
	
	
	
	
	
	
	
	}
}
