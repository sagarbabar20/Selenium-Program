package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    WebElement Capital=driver.findElement(By.xpath("//div[@id='box6']"));
    WebElement countary=driver.findElement(By.xpath("//div[@id='box106']"));

    Actions act=new Actions(driver);
    act.dragAndDrop(Capital, countary).perform();
    
    
}
	
}
