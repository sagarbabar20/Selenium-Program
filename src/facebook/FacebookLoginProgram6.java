package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginProgram6 
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
		
		WebElement UserName=driver.findElement(By.id("email"));
		UserName.sendKeys("7776067870");
		
		WebElement Password=driver.findElement(By.id("pass"));
		Password.sendKeys("Sagar@1997");
		
        WebElement loginButton=driver.findElement(By.name("login"));	
        loginButton.click();
        Thread.sleep(5000);
        
//        //Validation Apply
//        String expectedtitle="Facebook";
//        
//        String actualtitle=driver.getTitle();
//        System.out.println(actualtitle);
//        
//        if(expectedtitle.equals(actualtitle))
//        {
//        	System.out.println("test case pass");
//        }
//        else
//        {
//        	System.out.println("test case fail");
//        }
//        driver.close();
//    
        
        
	}

}
