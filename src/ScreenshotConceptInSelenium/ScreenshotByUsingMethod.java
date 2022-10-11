package ScreenshotConceptInSelenium;

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

public class ScreenshotByUsingMethod 
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
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.saucedemo.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    Screenshotmethod("login page");
		
        
	    WebElement UserName=driver.findElement(By.xpath("//input[@id='user-name']"));
		UserName.sendKeys("standard_user");

		WebElement passwprd=driver.findElement(By.xpath("//input[@id='password']"));
		passwprd.sendKeys("secret_sauce");

		WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
		
		Screenshotmethod("Home page");

		Thread.sleep(5000);
		
		driver.quit();
		
		System.out.println("end of program");
	}

}
