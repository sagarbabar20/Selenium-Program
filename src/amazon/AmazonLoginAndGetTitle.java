package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLoginAndGetTitle 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is Maximize");
		
		driver.get("https://www.amazon.in/gp/css/homepage.html?ref_=nav_youraccount_btn");
		System.out.println("URL is opened");
		
		WebElement Hellologin=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		Hellologin.click();
		
		WebElement username=driver.findElement(By.xpath("//input[@id='ap_email']"));
		username.sendKeys("7776067870");

		WebElement continuebutton1=driver.findElement(By.xpath("//input[@id='continue']"));
		continuebutton1.click();
		
		WebElement getanOTPonyourphone=driver.findElement(By.xpath("//input[@id='continue']"));
		getanOTPonyourphone.click();
		Thread.sleep(15000);
		
		WebElement Continuebutton2=driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		Continuebutton2.click();
		Thread.sleep(3000);
		
		String hometitle=driver.getTitle();
		System.out.println(hometitle);
		
		WebElement all=driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']"));
		all.click();
		
		WebElement signout=driver.findElement(By.xpath("(//a[@class='hmenu-item'])[27]"));
		signout.click();
		
		String signoutpagetitle=driver.getTitle();
		System.out.println(signoutpagetitle);


		
	}

}
