package HandleTheWebTable;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is Maximize");
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		System.out.println("URL is opened");
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//        WebElement allcells=driver.findElement(By.xpath("//td[text()='Selenium Webdriver with Java Basics + Advanced + Interview Guide']"));
//        String result=allcells.getText();
//        System.out.println(result);
    
        
        List<WebElement> totalheaders=driver.findElements(By.xpath("//table//tbody//tr//th"));
        System.out.println("total column is-"+totalheaders.size());
      
        for(int i=0; i<totalheaders.size(); i++)
        {
        	System.out.println(totalheaders.get(i).getText());
        }
        
        
       List<WebElement> alldata= driver.findElements(By.xpath("//table//tbody//tr//td"));
       System.out.println("Total column and row is-" +alldata.size());
       
       for(int i=0; i<alldata.size(); i++)
       {
    	   System.out.println(alldata.get(i).getText());
       }
	
       Thread.sleep(5000);
       
       driver.quit();
       
       System.out.println("end of program");

	
	}

}
