package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement textbox= driver.findElement(By.xpath("//input[@id='autocomplete']"));
		boolean result1=textbox.isDisplayed();
		System.out.println(result1);
		
		if(result1==true)
		{
//			textbox.click();
			boolean result2=textbox.isDisplayed();
			System.out.println(result2);
		}
		else
		{
			System.out.println("test case is fail");
		}

		
	}

}
