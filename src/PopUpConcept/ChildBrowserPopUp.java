package PopUpConcept;

import java.time.Duration;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is Maximize");
		
		driver.get("https://vctcpune.com/");
		System.out.println("URL is opened");
		
		//main page adress
//		String homepage=driver.getWindowHandle();
//		System.out.println(homepage);
		
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement startSeleniumPractice=driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
		startSeleniumPractice.click();
		
		
		//child page 
		//switch the selenium from parent Page to child Page
				
	    //address of all -> parentPage + childPage
				
		//casting
	    //int x = 100;
		//double y= (double)x;
				
		//Set --> List
		//we are geeting random values here.
		//hence we r not using this concept

		//upcasting concept
//       Set<String> Allpageaddress= driver.getWindowHandles();
//       System.out.println(Allpageaddress);
       
		
	List<String> AllPageAddress=new ArrayList<String>(driver.getWindowHandles());
		
	//need to switch on childPage
	//hence pass child page address

	driver.switchTo().window(AllPageAddress.get(1));

	WebElement textbox=driver.findElement(By.xpath("//input[@id='autocomplete']"));
	textbox.sendKeys("12345");
		
     System.out.println("end of program");
	
	}

}
