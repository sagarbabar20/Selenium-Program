package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is Maximize"); 
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		System.out.println("URL is opened");
        Thread.sleep(3000);
        
		WebElement radiobutton1=driver.findElement(By.xpath("//input[@value='Radio1']"));
		boolean result=radiobutton1.isSelected();
		System.out.println("radio button is selected-->"+result);
		
		if(result=false)
		{
			radiobutton1.click();
			boolean result2=radiobutton1.isSelected();
			System.out.println("Radio button is selected after cliking-->"+result2);
		}
		else
		{
			System.out.println("radio button is already selected");
		}
	}

}
