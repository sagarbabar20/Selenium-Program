package DifferentMethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScenarioWriting 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver_win32\\chromedriver.exe");
		
		//upcasting
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is open");
		
		String givenURL= "https://www.amazon.com/";  //given data-->BA,Dev
		driver.get(givenURL);
		System.out.println("URL is opened");
		
		//login page of amazon
		
		String actualURL = driver.getCurrentUrl();  //actual data
		System.out.println(actualURL);
		
		if(givenURL.equals(actualURL))
		{
			System.out.println("we landed on current web page ");
		    System.out.println("test case is passed");
		}
	
		else
		{
			System.out.println("test case is failed");
		}
		System.out.println("end of program");
	}

}
