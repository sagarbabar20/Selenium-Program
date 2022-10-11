package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLoginXpath
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is Maximize");
		
		driver.get("https://www.amazon.in/gp/css/homepage.html?ref_=nav_youraccount_btn");
		System.out.println("URL is opened");
		
		WebElement Hellologin=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		Hellologin.click();
		
		WebElement username=driver.findElement(By.xpath("//input[@id='ap_email']"));
		username.sendKeys("7776067870");

		WebElement continuebutton=driver.findElement(By.xpath("//input[@id='continue']"));
		continuebutton.click();

		WebElement password=driver.findElement(By.xpath("//input[@id='ap_password']"));
		password.sendKeys("Sagar@205");

		WebElement signin= driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		signin.click();
		
		//Approval msg link on your mobile  
	
			}

}
