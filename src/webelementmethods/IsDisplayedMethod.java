package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod 
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
		
		WebElement Hideelement=driver.findElement(By.xpath("//input[@id='hide-textbox']"));
		Hideelement.click();
		
		WebElement textbox=driver.findElement(By.xpath("//input[@id='displayed-text']"));
		boolean Result1=textbox.isDisplayed();
		System.out.println("Result after clicking hide button-->"+Result1);
		
		WebElement showelement=driver.findElement(By.xpath("//input[@id='show-textbox']"));
		showelement.click();
		boolean Result2=showelement.isDisplayed();
		System.out.println("Result after clicking show button-->"+Result2);
		
		System.out.println("applying the validation");
		
		if(Result1==true)
		{
			System.out.println("Text box is displayed");
			textbox.sendKeys("Sagar babar");
		}
		else
		{
			System.out.println("Text box is not displayed");
			showelement.click();
			textbox.sendKeys("Sagar Babar");
		}
		



		
	}

}
