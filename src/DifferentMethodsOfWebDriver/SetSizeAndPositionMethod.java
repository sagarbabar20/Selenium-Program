package DifferentMethodsOfWebDriver;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeAndPositionMethod 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//set size method
		                          // L   W
//		Dimension d = new Dimension(1000,500);
//		driver.manage().window().setSize(d);
		
		//browser position change
		
		Point p = new Point(50,50);
		driver.manage().window().setPosition(p);

	}

}
