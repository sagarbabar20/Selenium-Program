package keyboardsactioninselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CombinationOfAnyTwoKeys 
{
	public static void main(String[] args)     
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is Maximized");
		
		driver.get("https://text-compare.com/");
		System.out.println("URL is open");
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement TextBox1=driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		TextBox1.sendKeys("Sagar Babar");
		
		Actions act =new Actions(driver);
		
		//Select all-->ctrl+A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("A");
		act.keyUp(Keys.CONTROL);
		act.perform();

		//Copy All-->ctrl+C
		act.keyDown(Keys.CONTROL);
		act.sendKeys("C");
		act.keyUp(Keys.CONTROL);
		act.perform();

		WebElement TextBox2=driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		TextBox2.click();

		//Paste all-->ctrl+V
		act.keyDown(Keys.CONTROL);
		act.sendKeys("V");
		act.keyUp(Keys.CONTROL);
		act.perform();

		//compare
		WebElement compareButton=driver.findElement(By.xpath("//div[text()='Compare!']"));
		compareButton.click();
		
		WebElement Resultelement=driver.findElement(By.xpath("//span[@class='messageForUser']"));
		
		String ActualResult=Resultelement.getText();
	    System.out.println(ActualResult);
	    
	String expectedresult="The two texts are identical!";
	
	if(ActualResult.equals(expectedresult))
	{
		System.out.println("Test case is passed");
	}
	else
	{
		System.out.println("Test Case is failed");
	}
	System.out.println("end of program");
	}

}
