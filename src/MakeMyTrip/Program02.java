package MakeMyTrip;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program02 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	
WebElement roundtrip=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
roundtrip.click();


WebElement departure=driver.findElement(By.xpath("//label[@for='departure']"));
departure.click();

WebElement date=driver.findElement(By.xpath("//div[@aria-label='Fri Sep 30 2022']"));
date.click();

WebElement returns=driver.findElement(By.xpath("(//span[@class='lbl_input latoBold appendBottom10'])[2]"));
returns.click();

WebElement returndate=driver.findElement(By.xpath("(//div[@role='gridcell'])[61]"));
returndate.click();


Thread.sleep(5000);

driver.quit();

System.out.println("end of progrem");


}
}
