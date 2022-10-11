package ScreenshotConceptInSelenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotInFilpkart
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Selefile=ts.getScreenshotAs(OutputType.FILE);
		File myfile=new File("C:\\Selenium Screentshot\\Loginpage.png");
		FileHandler.copy(Selefile, myfile);
		WebElement mobilenumber=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		mobilenumber.sendKeys("7776067870");
		
		WebElement password=driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		password.sendKeys("Sagar@205");
	
		WebElement login= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		login.click();
		Thread.sleep(3000);
		File Selefile1=ts.getScreenshotAs(OutputType.FILE);
		File myfile1=new File("C:\\Selenium Screentshot\\homenpage.png");
		FileHandler.copy(Selefile1, myfile1);
	
		
		WebElement Searchbox=driver.findElement(By.xpath("//input[@name='q']"));
		Searchbox.sendKeys("vivo V25 Pro 5G (Pure Black, 256 GB)");
		Thread.sleep(3000);

		WebElement clickonSearchtab=driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		clickonSearchtab.click();
		Thread.sleep(3000);

		WebElement ClickonMobile=driver.findElement(By.xpath("//div[text()='vivo V25 Pro 5G (Pure Black, 256 GB)']"));
		ClickonMobile.click();
		Thread.sleep(3000);
		File Selefile2=ts.getScreenshotAs(OutputType.FILE);
		File myfile2=new File("C:\\Selenium Screentshot\\mobilepage.png");
		FileHandler.copy(Selefile2, myfile2);
	

		List<String> AllpageAddress=new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(AllpageAddress.get(1));
		
		WebElement Addtocart=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		Addtocart.click();
		
		File Selefile3=ts.getScreenshotAs(OutputType.FILE);
		File myfile3=new File("C:\\Selenium Screentshot\\addcartpage.png");
		FileHandler.copy(Selefile3, myfile3);
	    Thread.sleep(3000);
	    
		driver.quit();
		System.out.println("end of program");
	}


}
