package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FillInformation
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is Maximize");
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("URL is opened");
		Thread.sleep(3000);
		
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");
		Thread.sleep(3000);

		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin123");
		Thread.sleep(3000);

		WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
		Thread.sleep(3000);

		WebElement Empname=driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]"));
		Empname.sendKeys("Sagar");
		Thread.sleep(3000);
		
		WebElement Empid=driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
		Empid.sendKeys("12345");
		Thread.sleep(3000);

		WebElement empstatus=driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]"));
		
        Actions act=new Actions(driver);
        for(int i=0; i<=2; i++)
        {
        	
        act.click(empstatus).sendKeys(Keys.ARROW_DOWN).perform();
        
        }
        
//		WebElement option=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]"));
//		option.click();
//		Thread.sleep(3000);
        
//		Thread.sleep(3000);
		
//		driver.quit();
    
		
		System.out.println("end of program");


	}

}
