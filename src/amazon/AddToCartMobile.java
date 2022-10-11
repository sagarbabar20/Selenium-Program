package amazon;

import java.util.LinkedList;
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
		
		driver.get("https://www.amazon.in/gp/css/homepage.html?ref_=nav_youraccount_btn");
		System.out.println("URL is opened");
		
		
		WebElement clickonSearchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		clickonSearchbox.sendKeys("mobile");
		Thread.sleep(5000);
		
		WebElement searchtab=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchtab.click();
		Thread.sleep(5000);

		WebElement Samsungmobile=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		Samsungmobile.click();
		Thread.sleep(5000);

		List<String> AllPageAddress=new LinkedList<String>(driver.getWindowHandles());
		driver.switchTo().window(AllPageAddress.get(1));
		
		WebElement addtocart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		addtocart.click();
		Thread.sleep(5000);

		WebElement PopClose=driver.findElement(By.xpath("//a[@id='attach-close_sideSheet-link']"));
		PopClose.click();
		Thread.sleep(5000);

		WebElement basket=driver.findElement(By.xpath("//div[@id='nav-cart-count-container']"));
		basket.click();
		
		
		
		System.out.println("end of program");

		
	}

}
