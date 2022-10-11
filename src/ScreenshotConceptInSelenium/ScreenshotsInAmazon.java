package ScreenshotConceptInSelenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotsInAmazon 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File seleniumfile=ts.getScreenshotAs(OutputType.FILE);
		File myfile=new File("C:\\Selenium Screentshot\\homePageScreenshot2.png");
		FileHandler.copy(seleniumfile, myfile);

		Thread.sleep(3000);

		driver.quit();
		
		System.out.println("end of program");
		
	}

}
