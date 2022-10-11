package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddtoCartinSauceDemo 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	Thread.sleep(3000);
	WebElement Username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
	Username.sendKeys("standard_user");
	Thread.sleep(3000);

	WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
	password.sendKeys("secret_sauce");
	Thread.sleep(3000);

	WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
	login.click();
	Thread.sleep(3000);

	String title=driver.getTitle();
    System.out.println(title);
	Thread.sleep(3000);
	
	WebElement Backpack=driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']"));
	Backpack.click();
	
	WebElement basket=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	basket.click();
	
	WebElement checkout=driver.findElement(By.xpath("//button[@id='checkout']"));
	checkout.click();
	
	WebElement firstname=driver.findElement(By.xpath("(//input[@autocapitalize='none'])[1]"));
	firstname.sendKeys("Sagar");
	Thread.sleep(3000);
	
	WebElement lastname=driver.findElement(By.xpath("(//input[@autocorrect='off'])[2]"));
	lastname.sendKeys("Babar");
	Thread.sleep(3000);
	
	WebElement zipcode=driver.findElement(By.xpath("//input[@id='postal-code']"));
	zipcode.sendKeys("413307");
	Thread.sleep(3000);
	
	WebElement continuebutton=driver.findElement(By.xpath("//input[@id='continue']"));
	continuebutton.click();
	
	WebElement finish=driver.findElement(By.xpath("//button[text()='Finish']"));
	finish.click();
	
	WebElement backtohome=driver.findElement(By.xpath("//button[text()='Back Home']"));
	backtohome.click();

	 WebElement Tab=driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
	 Tab.click();
     Thread.sleep(3000);

	 WebElement logout=driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
     logout.click();
     Thread.sleep(3000);




}
}
