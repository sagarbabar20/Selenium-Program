package MakeMyTrip;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Senario3 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	WebElement search=driver.findElement(By.xpath("//a[text()='Search']"));
	search.click();
	
	WebElement slider1=driver.findElement(By.xpath("//div[@class='rangeslider rangeslider-horizontal']"));
	Thread.sleep(5000);

	Actions act=new Actions(driver);
    WebElement slider=driver.findElement(By.xpath("//div[@class='rangeslider__handle']"));
	Thread.sleep(5000);

    act.dragAndDrop(slider1, slider).perform();
//    act.dragAndDropBy(slider, -2000, 0).perform();
	
	Thread.sleep(5000);
	
	driver.quit();
	
	System.out.println("end of program");
	
	
	
	
	
	
	
//	WebElement roundtrip=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
//	roundtrip.click();


	
}
}
