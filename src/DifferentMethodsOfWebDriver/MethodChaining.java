package DifferentMethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodChaining 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//there is no such maximize method
		//available to web driver
		
//		driver.maximize();  not possible
//		driver.minimize();  not possible
		
		//we will take a help of another interface
		//to maximize the window and minimize the window
		
		//we can store such value
		//get title is returning the string so store it in string a var
		
//		String a=driver.getTitle();
//		System.out.println(a);
		
		//ex.1
		//browser maximize
//		Options o =driver.manage(); //1
//		Window w = o.window(); //2
//		w.maximize();  //3
		
		driver.manage().window().maximize();
		
		
		//ex.2
//		refresh-->browser window-->refresh
//		driver.refresh();  not possible
		
//		Navigation n=driver.navigate();
//		n.refresh();
		
		driver.navigate().refresh();
		
	}

}
