package filpkart;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartMobile 
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
		Thread.sleep(3000);
		
		WebElement Searchbox=driver.findElement(By.xpath("//input[@name='q']"));
		Searchbox.sendKeys("vivo V25 Pro 5G (Pure Black, 256 GB)");
		Thread.sleep(3000);

		WebElement clickonSearchtab=driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		clickonSearchtab.click();
		Thread.sleep(3000);

		WebElement ClickonMobile=driver.findElement(By.xpath("//div[text()='vivo V25 Pro 5G (Pure Black, 256 GB)']"));
		ClickonMobile.click();
		Thread.sleep(3000);

		List<String> AllpageAddress=new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(AllpageAddress.get(1));
		
		WebElement Addtocart=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		Addtocart.click();
		
		System.out.println("end of program");
	}

}
