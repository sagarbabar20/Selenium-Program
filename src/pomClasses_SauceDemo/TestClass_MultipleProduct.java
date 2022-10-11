package pomClasses_SauceDemo;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass_MultipleProduct 
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
			
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	//loginPage elements find +action perform
	POMClassMultipleProduct x=new POMClassMultipleProduct(driver);
	
	x.sendusername();
	System.out.println("username is entered");
	
	x.sendpassword();
	System.out.println("password is entered");
	
	x.clickonLoginbutton();
	System.out.println("clicked on login button");

	x.clickAllProduct();
}
}
