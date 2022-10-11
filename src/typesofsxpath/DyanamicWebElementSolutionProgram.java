package typesofsxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicWebElementSolutionProgram 
{
	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is maximize");
		
		driver.get("https://www.facebook.com/");
		System.out.println("URL is open");
//		Thread.sleep(3000);

		//1.By using Absolute Method
//		WebElement createnewaccount=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
//		createnewaccount.click();
		
		//2.By using relative Method
//		WebElement createnewaccount=driver.findElement(By.xpath("//div//div[5]//a"));
//		createnewaccount.click();

		//2.By using Contains By attribute Method
        WebElement createnewaccount=driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]"));
		createnewaccount.click();

		
	}

}
