package ScrollUpAndDownInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll 
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
		
		WebElement JoinNowButton=driver.findElement(By.xpath("(//a[@class='theme-btn'])[2]"));
		
		Actions act=new Actions(driver);
		act.scrollToElement(JoinNowButton).build().perform();
		Thread.sleep(5000);
		driver.quit();

		
	}

}
