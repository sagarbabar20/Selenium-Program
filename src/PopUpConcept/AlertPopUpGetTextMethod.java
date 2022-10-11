package PopUpConcept;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpGetTextMethod
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement clickme1=driver.findElement(By.xpath("//button[@id='alertButton']"));
		clickme1.click();
		
		Alert alt=driver.switchTo().alert();
		String ActualText=alt.getText();
		System.out.println(ActualText);
		
		Thread.sleep(3000);
		alt.accept();
		
		String expectedResult="You clicked a button";
		
		if(ActualText.equals(expectedResult))
		{
			System.out.println("test case is pass");
		}
		else
		{
			System.out.println("test case is fail");
		}
		
		System.out.println("end of program");
	}

}
