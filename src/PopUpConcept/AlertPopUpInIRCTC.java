package PopUpConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpInIRCTC
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	 
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.irctc.co.in/nget/train-search");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	WebElement okbutton=driver.findElement(By.xpath("//button[text()='OK']"));
	okbutton.click();
	
	

}
}
