package MouseActionAndMethods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionMethods 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is Maximize");
		
		driver.get("https://demoqa.com/buttons");
		System.out.println("URL is opened");
		
		Thread.sleep(3000);
		WebElement clickme=driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[3]"));
        Actions act=new Actions(driver);
		act.click(clickme).perform();
		Thread.sleep(3000);

		WebElement doubleclickme=driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]"));
        act.doubleClick(doubleclickme).perform();
		Thread.sleep(3000);

		WebElement rightclickme=driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[2]"));
        act.contextClick(rightclickme).perform();
        
        System.out.println("end of program");
        
	}

}
