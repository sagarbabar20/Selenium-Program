package IframeConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe01 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://chercher.tech/practice/frames");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	
	WebElement iframe2=driver.findElement(By.xpath("//iframe[@id='frame2']"));
	
	driver.switchTo().frame(iframe2);
	
	WebElement dropdown=driver.findElement(By.xpath("//select[@id='animals']"));
	dropdown.click();
	
	Select s=new Select(dropdown);
	
	s.selectByValue("avatar");
	
	Thread.sleep(5000);
	
	driver.quit();
	
	System.out.println("end of program");
	
}
}
