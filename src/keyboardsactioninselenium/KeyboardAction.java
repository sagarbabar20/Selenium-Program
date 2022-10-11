package keyboardsactioninselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is Maximize");
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		System.out.println("URL is opened");
		Thread.sleep(3000);
		
		WebElement textbox=driver.findElement(By.xpath("//input[@id='target']"));
		
		Actions act=new Actions(driver);
		
		// Type.1-->Character Entering
//		act.click(textbox).sendKeys("s").perform();

//		act.click(textbox).sendKeys("@").perform();
		
		// Type.2-->Different Button
		//ctrl,alt,delete,enter,backspace,home,shift....etc
//		act.sendKeys(Keys.ALT).perform();
		
//		act.sendKeys(Keys.DELETE).perform();
		
		act.sendKeys(Keys.ENTER).perform();
		
		WebElement resultelement=driver.findElement(By.xpath("//p[@id='result']"));
		String actualresult=resultelement.getText();
		System.out.println(actualresult);
		
		String expectedresult="You entered: ENTER";
		
		if(actualresult.equals(expectedresult))
		{
			System.out.println("test case is pass");
		}
		else
		{
			System.out.println("test case is fail");
		}
		
	}

}
