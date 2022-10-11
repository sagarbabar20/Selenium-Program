package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoLoginProgam1 
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
		Thread.sleep(3000);
		
		WebElement UserName=driver.findElement(By.id("user-name"));
		UserName.sendKeys("standard_user");
		Thread.sleep(3000);

		WebElement Password=driver.findElement(By.id("password"));
		Password.sendKeys("secret_sauce");
		Thread.sleep(3000);

		WebElement LoginButton=driver.findElement(By.id("login-button"));
		LoginButton.click();
		
		WebElement SauceLabsBackpack=driver.findElement(By.className("inventory_item_name"));
		SauceLabsBackpack.click();
//		Thread.sleep(3000);

		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("checkout")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("first-name")).sendKeys("Sagar");
		Thread.sleep(3000);

		driver.findElement(By.id("last-name")).sendKeys("Babar");
		Thread.sleep(3000);

		driver.findElement(By.id("postal-code")).sendKeys("413307");
		Thread.sleep(3000);

		driver.findElement(By.id("continue")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("finish")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("back-to-products")).click();

		//validation Apply

//		String expectedTitle = "Swag Labs";
//		
//		String ActualResult=driver.getTitle();
//				
//		if(expectedTitle.equals(ActualResult))
//		{
//			System.out.println("Test Case is Passed");
//		}
//		else
//		{
//			System.out.println("Test case is failed");
//		}
//		driver.close();
		
		
		
	}

}
