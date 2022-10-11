package ScreenshotConceptInSelenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class LoginAndHomePageScreenshot 
{
	public static void main(String[] args) throws IOException  
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is Maximize");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is opened");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File SeleniumFile=ts.getScreenshotAs(OutputType.FILE);
		File MyFile = new File("C:\\Selenium Screentshot\\LoginPageScreenshot2.jpg");
		FileHandler.copy(SeleniumFile, MyFile);

		WebElement UserName=driver.findElement(By.xpath("//input[@id='user-name']"));
		UserName.sendKeys("standard_user");
		
		WebElement passwprd=driver.findElement(By.xpath("//input[@id='password']"));
		passwprd.sendKeys("secret_sauce");

		WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
		
		File SeleniumFile1=ts.getScreenshotAs(OutputType.FILE);
		File MyFile1= new File("C:\\Selenium Screentshot\\HomePageScreenshot2.jpg");
		FileHandler.copy(SeleniumFile1, MyFile1);
		
		System.out.println("end of program");
	}

}
