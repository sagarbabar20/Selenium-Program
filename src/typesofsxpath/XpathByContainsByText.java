package typesofsxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsByText
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is Maximize");
		
		driver.get("https://kite.zerodha.com/?next=%2Fdashboard");
		System.out.println("URL is opened");
		
//		WebElement forgotidorpassword=driver.findElement(By.xpath("//a[contains(text(),'Forgot user ID or password?')]"));
//		forgotidorpassword.click();
		
		
		//In contains we can use partial values of attribute value of HTML text.
		WebElement forgotidorpassword2=driver.findElement(By.xpath("//a[contains(text(),'Forgot')]"));
		forgotidorpassword2.click();
		
	}

}
