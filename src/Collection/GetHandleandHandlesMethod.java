package Collection;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetHandleandHandlesMethod 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is Maximize");
		
		driver.get("https://www.w3schools.com/");
		System.out.println("URL is opened");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement trytoyourself=driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[1]"));
		trytoyourself.click();
	
		List<String> AllpageAddress=new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(AllpageAddress.get(1));
	    
	   WebElement changeorientation= driver.findElement(By.xpath("//a[@title='Change Orientation']"));
	   changeorientation.click();
	   
	   String URL= driver.getCurrentUrl();
	   System.out.println(URL);
	   
	   String pagetitle= driver.getTitle();
	   System.out.println(pagetitle);
	}

}
