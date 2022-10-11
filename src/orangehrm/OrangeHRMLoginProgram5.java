package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLoginProgram5 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is Maximize");
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("URL is opened");
		Thread.sleep(3000);
		
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
       WebElement loginButton=driver.findElement(By.className("oxd-button oxd-button--medium oxd-butto-main orangehrm-login-button"));	
       loginButton.click();
		
//		WebElement forgotpassword=driver.findElement(By.linkText("oxd-text oxd-text--p orangehrm-login-forgot-header"));
//		forgotpassword.click();
	}

}
