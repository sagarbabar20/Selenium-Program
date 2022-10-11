package gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathGmail 
{
	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is maximize");
		
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S1828974194%3A1662651877432678&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQN2RmUFN7l_sUpTf6vL5cUXQsMdXnbGMQohxmcUvZCby7siRGkMcfjSHSnnRls4L6wFx-HOd1BHYg");
		System.out.println("URL is open");
		
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("er.sagardbabar@gmail.com");
		
		driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[2]")).click();
		
//	     driver.findElement(By.xpath("")).sendKeys("Sagar7776");

		
	}

}
