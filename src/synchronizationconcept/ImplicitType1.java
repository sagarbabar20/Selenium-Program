package synchronizationconcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitType1 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is Maximize");
		
		driver.get("https://www.flipkart.com/");
		System.out.println("URL is opened");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement mobilenumber=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		mobilenumber.sendKeys("7776067870");
		
		WebElement password=driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		password.sendKeys("Sagar@205");
	
		WebElement login= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		login.click();
		Thread.sleep(5000);
		
		WebElement Searchbox=driver.findElement(By.xpath("//input[@name='q']"));
		Searchbox.sendKeys("iphone 14 pro max");
		Thread.sleep(5000);

		WebElement clickonSearchtab=driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		clickonSearchtab.click();
		Thread.sleep(5000);

		WebElement ClickonMobile=driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 Pro Max (Space Black, 128 GB)']"));
		ClickonMobile.click();
		
		String ActualTitle=driver.getTitle();
		System.out.println(ActualTitle);
		
		String expectedtitle="Iphone 14 Pro Max- Buy Products Online at Best Price in India - All Categories | Flipkart.com";
		
		if(ActualTitle.equals(expectedtitle))
		{
			System.out.println("test case is pass");
		}
		else
		{
		System.out.println("test case is fail");
		}
	}

}
