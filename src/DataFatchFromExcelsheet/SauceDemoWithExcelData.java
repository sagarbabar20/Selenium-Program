package DataFatchFromExcelsheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SauceDemoWithExcelData 
{
static WebDriver driver;
public static void screenshot(String Filename) throws IOException
{
	Date d = new Date();
	DateFormat d1 =new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
	String date=d1.format(d);
	
    TakesScreenshot ts=(TakesScreenshot)driver;
    File selefile=ts.getScreenshotAs(OutputType.FILE);
    File myfile = new File("C:\\Selenium Screentshot\\"+Filename+date+".jpg");
    FileHandler.copy(selefile, myfile);
	

}
	public static void main(String[] args) throws InterruptedException, IOException
	{
        String path="C:\\Excel Sheet file\\S1.xlsx";
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(file);

		String username= wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
        System.out.println(username);
		
		String password= wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
        System.out.println(password);
        
        
	System.setProperty("webdriver.chrome.driver", 
			"C:\\chromedriver_win32\\chromedriver.exe");
	
	 driver = new ChromeDriver();
	System.out.println("Browser is open");
	
	driver.manage().window().maximize();
	System.out.println("Browser is Maximize");
	
	driver.get("https://www.saucedemo.com/");
	System.out.println("URL is opened");
	Thread.sleep(3000);
	screenshot("login page");

	WebElement UserName=driver.findElement(By.xpath("//input[@id='user-name']"));
	UserName.sendKeys(username);
	
	WebElement passwprd=driver.findElement(By.xpath("//input[@id='password']"));
	passwprd.sendKeys(password);

	WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
	loginbutton.click();
	
	screenshot("Home page");

//	Thread.sleep(5000);

	
//	driver.quit();
	
	System.out.println("end of the program");
	}
}
