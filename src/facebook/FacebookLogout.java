package facebook;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogout 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement Username=driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		Username.sendKeys("sdbabar20@gmail.com");
		Thread.sleep(3000);
		
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Sagar#205");
		Thread.sleep(3000);

		WebElement loginbutton=driver.findElement(By.xpath("//button[@value='1']"));
		loginbutton.click();
		Thread.sleep(3000);
		
		WebElement search=driver.findElement(By.xpath("//label[@class='icdlwmnq o9w3sbdw f92fqwvt cavyzvzu bbgqxxx1 j4vk3mq5 bdao358l alzwoclg nd5c72wq om3e55n1 mfclru0v c8dj4xom kgnml90y']"));
		search.click();
		Thread.sleep(3000);

		WebElement searchtextbox=driver.findElement(By.xpath("//input[@type='search']"));
		searchtextbox.sendKeys("Manoj M Deshmukh");
		Thread.sleep(3000);

		WebElement manojDeshmukh=driver.findElement(By.xpath("(//span[@class='b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken'])[2]"));
		manojDeshmukh.click();
		Thread.sleep(3000);

		WebElement addfriend=driver.findElement(By.xpath("(//div[@aria-label='Add Friend'])[1]"));
		addfriend.click();
		Thread.sleep(3000);
		
		System.out.println("end of program");

	}

}
