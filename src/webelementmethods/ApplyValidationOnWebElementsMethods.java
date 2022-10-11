package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplyValidationOnWebElementsMethods
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
		
		WebElement UserName=driver.findElement(By.id("user-name"));
		UserName.clear();
		UserName.sendKeys("standard_user");

		WebElement Password=driver.findElement(By.id("password"));
		Password.clear();
		Password.sendKeys("secret_sauce");

		WebElement LoginButton=driver.findElement(By.id("login-button"));
		LoginButton.click();
		
		WebElement saucelabbackpack= driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		saucelabbackpack.click();

		WebElement saucelabbikelight= driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
		saucelabbikelight.click();
		
		WebElement bascketelement=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));

		String actualproductselected=bascketelement.getText();
		System.out.println(actualproductselected);
		
		String expectedproductselected="2";
		
		if(expectedproductselected.equals(actualproductselected))
		{
			System.out.println("test case is passed");
		}
		else
		{
			System.out.println("test case is failed");
		}
	
	
	
	
	
	
	
	
	
	}

}
