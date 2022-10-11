package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLoginXpath 
{
	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is maximize");
		
		driver.get("https://www.facebook.com/");
		System.out.println("URL is open");

		WebElement username=driver.findElement(By.xpath(""));
		username.sendKeys("7776067870");
		
		WebElement password=driver.findElement(By.xpath(""));
		password.sendKeys("Sagar@1997");
		
		WebElement loginbutton=driver.findElement(By.xpath(""));
		loginbutton.click();

	}

}
