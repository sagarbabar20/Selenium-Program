package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is Maximize");
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		System.out.println("URL is opened");
		
		WebElement TextBoxElement=driver.findElement(By.xpath("//input[@id='autocomplete']"));
		boolean result=TextBoxElement.isEnabled();
		System.out.println("Text Box Element is enabled-->"+result);
		
		if(result==true)
		{
			TextBoxElement.sendKeys("India");
		}
		else
		{
			System.out.println("we can not pass the since Text Box Element is disabled");
		}
		
		
		
	}

}
