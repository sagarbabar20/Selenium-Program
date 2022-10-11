package automationProgramPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScenarioBasedProgram
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
		driver.get("http://practice.automationtesting.in/");
		System.out.println("url is open");
		Thread.sleep(3000);
		
		WebElement Shopelement=driver.findElement(By.xpath("//a[text()='Shop']"));
		Shopelement.click();
		Thread.sleep(3000);

		WebElement homeelement=driver.findElement(By.xpath("//a[text()='Home']"));
		homeelement.click();
		Thread.sleep(3000);
		       
		WebElement sliderbutton=driver.findElement(By.xpath("//div[@id='n2-ss-6-arrow-next']"));
		sliderbutton.click();
		Thread.sleep(3000);

		WebElement sliderbutton2=driver.findElement(By.xpath("(//img[@class='n2-ow'])[2]"));
		sliderbutton2.click();

			
			}
	}


