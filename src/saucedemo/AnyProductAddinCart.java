package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnyProductAddinCart 
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

		WebElement SauceLabsOnesie=driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']"));
		SauceLabsOnesie.click();
		Thread.sleep(3000);

		
		WebElement addtocart=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']"));
		addtocart.click();
		Thread.sleep(3000);

		WebElement Shoppingcartlink=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		Shoppingcartlink.click();
		Thread.sleep(3000);

		WebElement clickoncheckout=driver.findElement(By.xpath("//button[@id='checkout']"));
		clickoncheckout.click();
		Thread.sleep(3000);

		WebElement enterfirstname=driver.findElement(By.xpath("//input[@id='first-name']"));
		enterfirstname.sendKeys("Sagar");
		Thread.sleep(3000);

		WebElement enterlastname=driver.findElement(By.xpath("//input[@id='last-name']"));
		enterlastname.sendKeys("Babar");
		Thread.sleep(3000);

		WebElement enterpostalcode=driver.findElement(By.xpath("//input[@id='postal-code']"));
		enterpostalcode.sendKeys("413307");

		WebElement clickoncontinuebutton=driver.findElement(By.xpath("//input[@id='continue']"));
		clickoncontinuebutton.click();
		Thread.sleep(3000);

		WebElement finish=driver.findElement(By.xpath("//button[@id='finish']"));
		finish.click();
		Thread.sleep(3000);

		WebElement backhome=driver.findElement(By.xpath("//button[@id='back-to-products']"));
		backhome.click();
		Thread.sleep(3000);

		WebElement clickonthreedots=driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
		clickonthreedots.click();
		Thread.sleep(3000);
	       
	    WebElement logoutbutton= driver.findElement(By.xpath("//a[text()='Logout']"));
	    logoutbutton.click();

	       
	    String Title=driver.getTitle();
	    System.out.println(Title);



		
	}

}
