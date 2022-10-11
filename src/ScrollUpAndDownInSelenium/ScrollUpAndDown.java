package ScrollUpAndDownInSelenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpAndDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is Maximize");
		
		driver.get("https://vctcpune.com/");
		System.out.println("URL is opened");
		Thread.sleep(3000);

		//int a=100;
//		double b= (double)a;
		
		JavascriptExecutor js=(JavascriptExecutor)driver;     //implicit Casting concept
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);

		js.executeScript("window.scrollBy(0,-1000)");
		
//web driver don't have scrolling action methods
//lets do the casting of driver variable
		
		
	}

}
