package automationProgramPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ShopDefaultSorting
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
		driver.get("http://practice.automationtesting.in/");
		System.out.println("url is open");
		Thread.sleep(3000);
		
		WebElement Shopelement=driver.findElement(By.xpath("//a[text()='Shop']"));
		Shopelement.click();
		Thread.sleep(3000);
		
		WebElement Defaultsorting=driver.findElement(By.xpath("//select[@name='orderby']"));
		Thread.sleep(3000);

		Select s =new Select(Defaultsorting);
		
		s.selectByValue("popularity");
	}

}
