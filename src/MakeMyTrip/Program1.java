package MakeMyTrip;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		
	WebElement roundtrip=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
	boolean result=roundtrip.isSelected();
	System.out.println("round trip button is selected-"+result);
	
	if(result==false)
	{
		roundtrip.click();
		boolean result1=roundtrip.isSelected();
		System.out.println("round trip button after clicking-->"+result1);
	}
	else
	{
		System.out.println("round trip button already selected");
	}
	
	driver.quit();
	
	System.out.println("end of program");
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
