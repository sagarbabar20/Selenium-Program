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

public class OrangeHRM 
{
	public static void main(String[] args) throws InterruptedException, IOException 
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
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		
		File selefile=ts.getScreenshotAs(OutputType.FILE);
		
		File myfile= new File("C:\\Selenium Screentshot\\LoginPageScreenshot.jpg");
		
		FileHandler.copy(selefile, myfile);
		
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");
		Thread.sleep(3000);

		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin123");
		Thread.sleep(3000);

		WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
		Thread.sleep(3000);

	    File selefile1=ts.getScreenshotAs(OutputType.FILE);

	    File myfile1 = new File("C:\\Selenium Screentshot\\homePageScreenshot.jpg");
	
	    FileHandler.copy(selefile1, myfile1);
	    
	    
	    driver.quit();
		System.out.println("end of program");
		
		
	}

}
