package automationProgramPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyAccount
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
	
		WebElement myAccont=driver.findElement(By.xpath("//a[text()='My Account']"));
		myAccont.click();
		
		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("sdbabar20@gmail.com");

		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("sdbabar20");

		WebElement login=driver.findElement(By.xpath("//input[@value='Login']"));
		login.click();
		
		WebElement dashbord=driver.findElement(By.xpath("//a[text()='Dashboard']"));
		dashbord.click();
	}

}
