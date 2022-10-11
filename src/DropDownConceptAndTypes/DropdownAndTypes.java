package DropDownConceptAndTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownAndTypes 
{
   static public void main(String args[])
	{
	   System.setProperty("webdriver.chrome.driver", 
				"C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is Maximize");
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		System.out.println("URL is opened");
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		dropdown.click();
		
		//Selenium Class
		//in const always pass a dropdown element
		Select s =new Select(dropdown);
		
		//1.select By Value
//		s.selectByValue("option3");
		
		//2.select By Index
//		s.selectByIndex(2);
		
		//3.select By visible text
		s.selectByVisibleText("Option1");


		
		
		
	}

}
