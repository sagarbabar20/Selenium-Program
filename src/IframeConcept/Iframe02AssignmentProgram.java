package IframeConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe02AssignmentProgram 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement iframe1=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(iframe1);

		
		WebElement iframe3=driver.findElement(By.xpath("//iframe[@id='frame3']"));
		driver.switchTo().frame(iframe3);
		
		WebElement Checkbox=driver.findElement(By.xpath("//input[@id='a']"));
		Checkbox.click();
		Thread.sleep(5000);
        
		
	
		Thread.sleep(5000);
		
		driver.quit();
		
		System.out.println("end of program");
		
	}

}
