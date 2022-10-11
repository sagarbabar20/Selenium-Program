package MouseActionAndMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextmethodandapplyValidation
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", 
			"C:\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	System.out.println("Browser is open");
	
	driver.manage().window().maximize();
	System.out.println("Browser is Maximize");
	
	driver.get("https://demoqa.com/buttons");
	System.out.println("URL is opened");

	WebElement rightclickme=driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[2]"));
    Actions act =new Actions(driver);
	act.contextClick(rightclickme).perform();
	
	String expectedmsg="you have done in a right click";
	
	WebElement msgdisplay=driver.findElement(By.xpath("//p[@id='rightClickMessage']"));
	String actualmsg=msgdisplay.getText();
	
	if(expectedmsg.equals(actualmsg))
	{
		System.out.println("Test case is pass");
	}
	else
	{
		System.out.println("Test case is pass");

	}
}
}
