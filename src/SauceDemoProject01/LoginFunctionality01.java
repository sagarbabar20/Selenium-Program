package SauceDemoProject01;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class LoginFunctionality01
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
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("Sauce demo URL is opened");
		Thread.sleep(3000);
		
		Screenshotmethod("login page");
		System.out.println("login page screenshot is taken");
		
		WebElement UserName=driver.findElement(By.xpath("//input[@id='user-name']"));
		UserName.sendKeys("standard_user");
		System.out.println("Username is Entered");
		
		WebElement passwprd=driver.findElement(By.xpath("//input[@id='password']"));
		passwprd.sendKeys("secret_sauce");
		System.out.println("Password is entered");

		WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
		System.out.println("clicked on login button");
		
		Screenshotmethod("Home Page");
		System.out.println("Home page screenshot is taken");
		
		System.out.println("Apply the Validation");
		
		String expectedTitle="Swag Labs";
		
		String actualTitle=driver.getTitle();
		System.out.println();
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Login functionality test Case is passed");
		}
		else
		{
			System.out.println("Login functionality test case is failed");
		}
		
		Thread.sleep(3000);

		driver.close();
		System.out.println("Browser is Closed");

		System.out.println("end of program");
		
	}

}
