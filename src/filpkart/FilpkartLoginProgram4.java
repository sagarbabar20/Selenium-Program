package filpkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilpkartLoginProgram4 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is Maximize");
		
		driver.get("https://www.flipkart.com/");
		System.out.println("URL is opened");
		

		driver.findElement(By.className("_2IX_2- VJZDxU")).sendKeys("7776067870");
		
		driver.findElement(By.tagName("input")).sendKeys("Sagar@205");
		
		driver.findElement(By.tagName("button")).click();
		
		
	}

}
