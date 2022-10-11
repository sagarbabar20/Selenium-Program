package automationProgramPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration 
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
		
		WebElement myaccount=driver.findElement(By.xpath("//a[text()='My Account']"));
		myaccount.click();
		Thread.sleep(3000);
		
		WebElement EnterEmailid=driver.findElement(By.xpath("//input[@id='reg_email']"));
		EnterEmailid.sendKeys("sdbabar20@gmail.com");
		Thread.sleep(3000);

		WebElement password=driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		password.sendKeys("sdbabar20");
		Thread.sleep(3000);

		WebElement register=driver.findElement(By.xpath("//input[@value='Register']"));
		register.click();

	}

}
