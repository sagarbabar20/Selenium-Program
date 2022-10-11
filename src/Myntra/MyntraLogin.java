package Myntra;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.gecko.driver","C:\\chromedriver_win32\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		System.out.println("browser is open");
		
		driver.manage().window().maximize();
		System.out.println("browser is open");

		driver.get("https://www.myntra.com/");
		System.out.println("url is open");
		Thread.sleep(3000);

		WebElement login=driver.findElement(By.xpath("//span[@class='desktop-userTitle']"));
        Actions act =new Actions(driver);
		act.moveToElement(login).perform();
		Thread.sleep(3000);

		WebElement loginbutton=driver.findElement(By.xpath("//a[@class='desktop-linkButton']"));
		loginbutton.click();
		Thread.sleep(3000);
		
		WebElement mobileno=driver.findElement(By.xpath("//input[@type='tel']"));
		mobileno.sendKeys("7776067870");
		Thread.sleep(3000);

		WebElement continuebutton=driver.findElement(By.xpath("//div[text()='CONTINUE']"));
		continuebutton.click();
	
	
	}

}
