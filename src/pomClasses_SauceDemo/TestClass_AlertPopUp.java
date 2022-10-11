package pomClasses_SauceDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass_AlertPopUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		System.out.println("Browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("Browser is maximised");
		
		driver.get("https://demoqa.com/alerts");
		
		POMClassAlertPopUp x=new POMClassAlertPopUp(driver);
//		x.Clickedclickmebutton();
		
//		x.Clickedclickmebutton2();
		
//		x.Clickedclickmebutton3();
		
		x.Clickedclickmebutton4();
		
		Thread.sleep(3000);
		
		Alert alt=driver.switchTo().alert();
//		alt.accept();
		
//		alt.accept();

//		alt.dismiss();
		
//		String expectedText="You clicked a button";
		alt.sendKeys("Sagar");
		alt.accept();
	}

}
