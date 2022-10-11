package automationProgramPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopFilterByPriceFunactionality
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
		
		Actions act=new Actions(driver);

		WebElement slider1=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
        act.dragAndDropBy(slider1, 50, 0).perform();
		Thread.sleep(5000);

		WebElement Slider2=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
        act.dragAndDropBy(Slider2, -100, 0).perform();
	}

}
