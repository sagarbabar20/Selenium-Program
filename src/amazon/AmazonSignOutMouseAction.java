package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonSignOutMouseAction 
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
		Thread.sleep(5000);
		
		WebElement Hellologin=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		Hellologin.click();
		
		WebElement username=driver.findElement(By.xpath("//input[@id='ap_email']"));
		username.sendKeys("7776067870");

		WebElement continuebutton1=driver.findElement(By.xpath("//input[@id='continue']"));
		continuebutton1.click();
		
		WebElement getanOTPonyourphone=driver.findElement(By.xpath("//input[@id='continue']"));
		getanOTPonyourphone.click();
		Thread.sleep(15000);
		
		WebElement Continuebutton2=driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		Continuebutton2.click();
		Thread.sleep(5000);
		
		WebElement AccountList=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));

		Actions act=new Actions(driver);
		act.moveToElement(AccountList).perform();
		
		WebElement signout=driver.findElement(By.xpath("//span[text()='Sign Out']"));
		signout.click();
	}

}
