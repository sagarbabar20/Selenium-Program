package saucedemo;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllProductsSelectAtaTime 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", 
			"C:\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	System.out.println("Browser is open");
	
	driver.manage().window().maximize();
	System.out.println("Browser is Maximize");
	
	driver.get("https://www.saucedemo.com/");
	System.out.println("URL is opened");

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement UserName=driver.findElement(By.xpath("//input[@id='user-name']"));
	UserName.sendKeys("standard_user");
	
	WebElement passwprd=driver.findElement(By.xpath("//input[@id='password']"));
	passwprd.sendKeys("secret_sauce");

	WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
	loginbutton.click();
	//scenario2
    //all elements need to select at a time
	//List<Integer> x = driver.findElements(By.xpath("??"));
    //we will use driver.findElements method-> which will find all elemetns at a time
	//we will use a common xpath to all elments
			
	List<WebElement> allproduct=driver.findElements(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
//	allproduct.get(0).click();
//	allproduct.get(1).click();
//	allproduct.get(2).click();
//	allproduct.get(3).click();
//	allproduct.get(4).click();
//	allproduct.get(5).click();
	
//	for(int i=0; i<allproduct.size(); i++)
//	{
//		allproduct.get(i).click();
//	}
	
//	for(WebElement product : allproduct);
//	{
//      System.out.println(product);
//		}
//	
	System.out.println("end of program");
	

}
}
