package MouseActionAndMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement 
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
        Thread.sleep(5000);
        
		WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(loginbutton).click().perform();
		
	}

}
