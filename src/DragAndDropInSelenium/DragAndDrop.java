package DragAndDropInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is Maximize");
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		System.out.println("URL is opened");

		WebElement Capitals=driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement Country=driver.findElement(By.xpath("//div[@id='box103']"));

		WebElement Capitals2=driver.findElement(By.xpath("//div[@id='box6']"));
        WebElement Country2=driver.findElement(By.xpath("//div[@id='box106']"));

		WebElement Capitals3=driver.findElement(By.xpath("//div[@id='box7']"));
        WebElement Country3=driver.findElement(By.xpath("//div[@id='box107']"));

		Actions act=new Actions(driver);
		
		act.dragAndDrop(Capitals, Country).perform();
		
		act.dragAndDrop(Capitals2, Country2).perform();
		
		act.dragAndDrop(Capitals3, Country3).perform();
//--------------------------------------------------------------------------		
		//Mouse Action
		//Action Build
		//Action Perform
		
		//Action Build
		act.dragAndDrop(Capitals, Country);
		
		//Action Perform
		act.dragAndDrop(Capitals, Country).perform();
//--------------------------------------------------------------------------
		// What is build method and perform method
//Build method-->It is used to build the action
//Perform method-->It is used to perform the action
		
		act.dragAndDrop(Capitals, Country).build();
		
		act.dragAndDrop(Capitals, Country).build().perform();
		
// no need to write the build method
// since perform method will call build method internally
		
// What is Actions And Action?
		
//Actions-->Selenium Class
//Perform method is of Actions class
		act.perform();
		
//Action-->Selenium Interface
		Action actinterface=act.click().build();
//Perform method is of Action interface
		actinterface.perform();
		//or
		act.click().perform();

		
		
		

		
	}

}
