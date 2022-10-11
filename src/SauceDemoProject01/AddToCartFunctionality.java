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

public class AddToCartFunctionality 
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
		System.out.println("URL is opened");
		
		Screenshotmethod("Sauce demo login page");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement UserName=driver.findElement(By.xpath("//input[@id='user-name']"));
		UserName.sendKeys("standard_user");
		System.out.println("username is entered");
		
		WebElement passwprd=driver.findElement(By.xpath("//input[@id='password']"));
		passwprd.sendKeys("secret_sauce");
		System.out.println("password is entered");

        WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
		Thread.sleep(3000);
		System.out.println("clicked on login button");

		Screenshotmethod("Sauce demo home page");

		WebElement SauceLabsOnesie=driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']"));
		SauceLabsOnesie.click();
		Thread.sleep(3000);
		System.out.println("product is selected");

		Screenshotmethod("Sauce demo product page");

		WebElement addtocart=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']"));
		addtocart.click();
		Thread.sleep(3000);
		System.out.println("clicked on add to cart button");

		WebElement basket=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		
		System.out.println("apply the validation");
		String expectedtext="1";
		String actualtext=basket.getText();
		
		if(expectedtext.equals(actualtext))
		{
			System.out.println("add to cart functionality test case is passed");
		}
		else
		{
			System.out.println("add to cart functionality test case is failed");
      }
		
		driver.close();
		
		System.out.println("end of program");
		
	}

}
