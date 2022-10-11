package PopUpConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivisionPopUpFacebookSignUp 
{
public static void main(String []args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
 
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement createnewaccount=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	createnewaccount.click();
	Thread.sleep(3000);
	
	WebElement Firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
	Firstname.sendKeys("Sagar");
	Thread.sleep(3000);

	WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
	lastname.sendKeys("Babar");
	Thread.sleep(3000);

	WebElement Emaiid=driver.findElement(By.xpath("//input[@name='reg_email__']"));
	Emaiid.sendKeys("sdbabar20@gmail.com");
	Thread.sleep(3000);

	WebElement ReEnterEmailid=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
	ReEnterEmailid.sendKeys("sdbabar20@gmail.com");
	Thread.sleep(3000);

	WebElement newpassword=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	newpassword.sendKeys("Sagar#205");
	Thread.sleep(3000);

    WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
	Select s=new Select(day);
    s.selectByValue("20");
	Thread.sleep(3000);

	WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
	Select m=new Select(month);
    m.selectByValue("5");
	Thread.sleep(3000);

	WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
	Select y=new Select(year);
    y.selectByVisibleText("1997");
	Thread.sleep(3000);

	WebElement gender=driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
	gender.click();
	Thread.sleep(3000);

	WebElement signupbutton=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	signupbutton.click();
	Thread.sleep(20000);



    
    
}
}
