package SauceDemoProject01;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class VerifyLogoutFunctionality02 
{
	static WebDriver driver;
	public static void Screenshotmethod(String Screenshotname) throws IOException
	{
 		Date d= new Date();
		DateFormat d1=new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
	    String date=d1.format(d);
	    
	TakesScreenshot ts=(TakesScreenshot)driver;
	File seleniumfile=ts.getScreenshotAs(OutputType.FILE);
    File myFile = new File("C:\\Selenium Screentshot\\"+Screenshotname +date+".jpg");
    FileHandler.copy(seleniumfile, myFile);	
	
	}
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is Maximize");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("Sauce demo URL is opened");
		Screenshotmethod("Login Page");

		WebElement UserName=driver.findElement(By.xpath("//input[@id='user-name']"));
		UserName.sendKeys("standard_user");
		System.out.println("Username is entered");
		
		WebElement passwprd=driver.findElement(By.xpath("//input[@id='password']"));
		passwprd.sendKeys("secret_sauce");
		System.out.println("Password is entered");

		WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
		Screenshotmethod("Home Page");
		System.out.println("Clicked on login button");

	    WebElement MenuButton= driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
	    MenuButton.click();
		System.out.println("Clicked on menu button");
        Thread.sleep(2000);
       
        WebElement logoutbutton= driver.findElement(By.xpath("//a[text()='Logout']"));
        logoutbutton.click();
		System.out.println("Clicked on logout button");
		
		System.out.println("Apply the validation");
		
		String expectedURL="https://www.saucedemo.com/";
		
		String ActualURL=driver.getCurrentUrl();
		
		if(expectedURL.equals(ActualURL))
		{
			System.out.println("Logout functionality test case is passed");
		}
		else
		{
			System.out.println("Logout functionality test case is failed");

		}


		driver.close();
		System.out.println("Browser is closed");
		
		System.out.println("end of the program");
       

		
	}

}
