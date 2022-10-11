package gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLoginProgram7 
{
	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is maximize");
		
		driver.get("https://www.gmail.com/");
		System.out.println("URL is open");
		
		driver.findElement(By.id("identifierId")).sendKeys("er.sagardbabar@gmail.com");
		
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		
		driver.findElement(By.name("Passwd")).sendKeys("Sagar7776");
		
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
	}

}
