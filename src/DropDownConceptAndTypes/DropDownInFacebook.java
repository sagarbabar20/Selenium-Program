package DropDownConceptAndTypes;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownInFacebook 
{
	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", 
					"C:\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			System.out.println("Browser is open");
			
			driver.manage().window().maximize();
			System.out.println("Browser is Maximize");
			
			driver.get("https://www.facebook.com/");
			System.out.println("URL is opened");
			
			WebElement createnewaccount=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
			createnewaccount.click();
			Thread.sleep(3000);
			
			WebElement dropdown=driver.findElement(By.xpath("//select[@id='day']"));
			dropdown.click();
			Select s=new Select(dropdown);
		    s.selectByValue("20");
			Thread.sleep(3000);

			WebElement monthdropdown=driver.findElement(By.xpath("//select[@id='month']"));
			monthdropdown.click();
      		Select a=new Select(monthdropdown);
            a.selectByVisibleText("May");
			Thread.sleep(3000);

			WebElement yeardropdown=driver.findElement(By.xpath("//select[@id='year']"));
			yeardropdown.click();
            Select y=new Select(yeardropdown);
			y.selectByValue("1997");
	

	}

}
