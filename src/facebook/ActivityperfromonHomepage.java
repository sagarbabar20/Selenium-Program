package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityperfromonHomepage 
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

		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("7776067870");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("Sagar@1997");
		
		WebElement loginbutton=driver.findElement(By.xpath("//button[@name='login']"));
		loginbutton.click();
		Thread.sleep(5000);

		WebElement ReelaButton=driver.findElement(By.xpath("//span[@class='gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w innypi6y d1w2l3lo']"));
		ReelaButton.click();
		
//		WebElement Firstreel=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[1]/div/div/div/div[1]/div"));
//		Firstreel.click();
		
//		WebElement loginbutton=driver.findElement(By.xpath("//button[@name='login']"));
//		loginbutton.click();


		
	}

}
