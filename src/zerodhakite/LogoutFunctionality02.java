package zerodhakite;

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

public class LogoutFunctionality02 
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
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is Maximize");
		
		driver.get("https://kite.zerodha.com/?next=%2Fdashboard");
		System.out.println("Zerodha URL is open");
		
		Screenshotmethod("login page");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement userid=driver.findElement(By.xpath("//input[@id='userid']"));
		userid.sendKeys("GKT101");
		System.out.println("user id entered");
		Thread.sleep(3000);
		
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Sagar@205");
		System.out.println("password is entered");
		Thread.sleep(3000);

		WebElement loginbutton=driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		loginbutton.click();
		System.out.println("Clicked on login button");
		Thread.sleep(3000);

		Screenshotmethod("pin page");

		WebElement pin=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/form/div[2]/input"));
		pin.sendKeys("199720");
		System.out.println("pin is entered");
		Thread.sleep(3000);

		WebElement continuebutton=driver.findElement(By.xpath("//button[@type='submit']"));
		continuebutton.click();
		System.out.println("Clicked on login button");
		
		WebElement watchlist=driver.findElement(By.xpath("//span[@class='icon icon-bookmark']"));
		watchlist.click();
		System.out.println("Clicked on watchlist button");
		
		WebElement searchtextbox=driver.findElement(By.xpath("//input[@type='text']"));
		searchtextbox.sendKeys("TCS");
		
//		WebElement searchtextbox=driver.findElement(By.xpath("//input[@type='text']"));
//		searchtextbox.sendKeys("TCS");

		
		

		
	}

}
