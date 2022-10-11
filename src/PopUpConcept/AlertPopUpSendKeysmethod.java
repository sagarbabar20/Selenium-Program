package PopUpConcept;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpSendKeysmethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement clickme4=driver.findElement(By.xpath("//button[@id='promtButton']")); 
		clickme4.click();
		
		Thread.sleep(3000);
		
		Alert alt=driver.switchTo().alert();
		alt.sendKeys("Sagar");
		alt.accept();
		
		
	System.out.println("end of program");
	}

}
