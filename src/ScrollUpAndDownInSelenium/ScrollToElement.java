package ScrollUpAndDownInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
				
		Actions act=new Actions(driver);
		
		act.scrollByAmount(0, 5000).perform();
		Thread.sleep(5000);
		
		act.scrollByAmount(0, -5000).perform();
		Thread.sleep(5000);

		driver.quit();
		
		System.out.println("end of program");

	}

}
