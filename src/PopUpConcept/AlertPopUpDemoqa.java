package PopUpConcept;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpDemoqa 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	 
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demoqa.com/alerts");
	Thread.sleep(3000);
	
	WebElement clickme1=driver.findElement(By.xpath("//button[@id='alertButton']"));
	clickme1.click();
	Alert alt=driver.switchTo().alert();
	alt.accept();
    
    WebElement clickme2=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
    clickme2.click();
	Thread.sleep(7000);
	
	Alert alt2=driver.switchTo().alert();
	alt2.accept();

	
}
}
