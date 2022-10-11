package DifferentMethodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLtextUse 
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
		
		
        //1.link text-->total value of HTML text need to pass
//        WebElement Forgottenpassword=driver.findElement(By.linkText("Forgotten password?"));
//        Forgottenpassword.click();
        
        //2.partial link text-->partial value of HTML text need to pass.
//        WebElement Forgottenpassword1=driver.findElement(By.partialLinkText("Forgotten password?"));
//        Forgottenpassword1.click();
        
        //3.method chaining
        driver.findElement(By.partialLinkText("Forgotten password?")).click();
	}

}
