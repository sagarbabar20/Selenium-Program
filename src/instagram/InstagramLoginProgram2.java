package instagram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginProgram2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is maximize");
		
		driver.get("https://www.instagram.com/accounts/login/");
		System.out.println("URL is open");
		Thread.sleep(3000);
		
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("its_sagar_9192");
		Thread.sleep(3000);

		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("Hitman@654");
		Thread.sleep(5000);

		WebElement loginbutton=driver.findElement(By.className("             qF0y9          Igw0E     IwRSH      eGOV_       acqo5   _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    "));
		loginbutton.click();
		
		
	}

}
