package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VelocityWebsite 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement radio3=driver.findElement(By.xpath("//input[@value='Radio3']"));
        boolean result=radio3.isSelected();
		System.out.println(result);
		
		if(result==false)
		{
			radio3.click();
			boolean result2=radio3.isSelected();
            System.out.println(result2);
		}
		else
		{
			System.out.println("Test case is fail");
		}
		
	
	}

}
