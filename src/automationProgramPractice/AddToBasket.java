package automationProgramPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToBasket 
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
		
		WebElement addtobasket=driver.findElement(By.xpath("(//a[text()='Add to basket'])[4]"));
		addtobasket.click();
		
		WebElement viewbasket=driver.findElement(By.xpath("//a[@class='added_to_cart wc-forward']"));
		viewbasket.click();

//		WebElement proccedtocheckout=driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']"));
//		proccedtocheckout.click();
		
		WebElement Total=driver.findElement(By.xpath("(//th[text()='Total'])[2]"));
		String text1=Total.getText();
		System.out.println(text1);
		
		WebElement Subtotal=driver.findElement(By.xpath("//th[text()='Subtotal']"));
		String text2=Subtotal.getText();
		System.out.println(text2);
		
//		if(text1<text2)
//		{
//			System.out.println("test case is pass");
//		}
//		else
//		{
//			System.out.println("test case is fail");
//
//		}
//		System.out.println("end of program");
		

		
	}

}
