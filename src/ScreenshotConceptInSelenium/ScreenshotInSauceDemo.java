package ScreenshotConceptInSelenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotInSauceDemo 
{
	public static void main(String []args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.saucedemo.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	        //screenshot
	  		//casting
  		    //int a = 100;
	  		//double b=(double)a;

	   TakesScreenshot ts=(TakesScreenshot)driver;
	   
	    //screenshot-byte format
		//ts.getScreenshotAs(null);  
		//we need a screenshot in file format
		//jpg,png,.jpeg files 
		
	   File seleniumfile= ts.getScreenshotAs(OutputType.FILE);

		 //screenshot -> file format-> png?, jpg?, jpeg??
		//location file->?
		//---------------
//		location -> yes
//		name of file-> yes
//		format of file-> yes
		
	  	   
	   File MyFile=new File("C:\\Selenium Screentshot\\SauceDemoLoginPage1.jpg");


	   FileHandler.copy(seleniumfile, MyFile);
	   
	   System.out.println("end of program");
	}

}
