package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonWebsite 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	String homepagetitle=driver.getTitle();
	System.out.println(homepagetitle);
	Thread.sleep(3000);
	
	WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	search.sendKeys("iPhone 14 Plus 256GB Starlight");
	Thread.sleep(3000);

	WebElement searchtab=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	searchtab.click();
	Thread.sleep(3000);

	WebElement clickonmobile=driver.findElement(By.xpath("//span[text()='iPhone 14 Plus 256GB Starlight']"));
	clickonmobile.click();
	Thread.sleep(3000);

	String title=driver.getTitle();
    System.out.println(title);
	Thread.sleep(3000);

        
    System.out.println("end of program");
}
}
