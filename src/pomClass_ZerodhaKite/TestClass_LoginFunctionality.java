package pomClass_ZerodhaKite;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass_LoginFunctionality
{
	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is Maximize");
		
		driver.get("https://kite.zerodha.com/?next=%2Fdashboard");
		System.out.println("Zerodha URL is open");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		POMClass_LoginFunctionality x= new POMClass_LoginFunctionality(driver);
		
		x.senduserid();
		System.out.println("userid is entered");
		
		x.sendpassword();
		System.out.println("password is entered");

		x.ClickContinueButton();
		System.out.println("Clicked on continue button");
        Thread.sleep(3000);
        
		x.sendpintextbox();
		System.out.println("pin is entered");

		x.ClickContinueButton2();
		System.out.println("Clicked on continue button2");

		System.out.println("apply the validation");
		
        String expectedTitle="Kite - Zerodha's fast and elegant flagship trading platform";
		
		String hometitle=driver.getTitle();
		System.out.println(hometitle);
		
		if(expectedTitle.equals(hometitle))
		{
			System.out.println("Login functionality test case passed");
		}
		else
		{
			System.out.println("Login functionality test case failed");

		}
		
		
		System.out.println("end of program");

	}

}
