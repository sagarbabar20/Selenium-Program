package filpkart;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectMensTshirtsoptioninFashionTab 
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
		Thread.sleep(3000);
		
		Actions act =new Actions(driver);

		WebElement Loginwindowclose=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		act.click().perform();
		Thread.sleep(2000);

		WebElement fashion=driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
		act.moveToElement(fashion).perform();
		Thread.sleep(2000);

		WebElement menstopwear=driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		act.moveToElement(menstopwear).perform();
		Thread.sleep(2000);

		WebElement mensTshirts=driver.findElement(By.xpath("(//a[@class='_6WOcW9 _3YpNQe'])[2]"));
		mensTshirts.click();

				
		
		
	}

}
