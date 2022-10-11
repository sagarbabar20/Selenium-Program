package automationProgramPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopReadMoreFun 
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
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement Shopelement=driver.findElement(By.xpath("//a[text()='Shop']"));
		Shopelement.click();
		Thread.sleep(3000);
		
		WebElement readmore=driver.findElement(By.xpath("(//a[@class='button product_type_simple ajax_add_to_cart'])[1]"));
		readmore.click();
	}

}
