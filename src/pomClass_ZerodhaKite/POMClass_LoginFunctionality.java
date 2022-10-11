package pomClass_ZerodhaKite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass_LoginFunctionality 
	{
		WebDriver driver;
		
		@FindBy(xpath="//input[@id='userid']")
		WebElement Userid;
		
		public void senduserid()
		{
			Userid.sendKeys("GKT101");
		}
		
		@FindBy(xpath="//input[@id='password']")
		WebElement password;
		
		public void sendpassword()
		{
			password.sendKeys("Sagar@205");
		}
		
		@FindBy(xpath="//button[@class='button-orange wide']")
		WebElement ContinueButton;
		
		public void ClickContinueButton()
		{
			ContinueButton.click();
		}
		
		@FindBy(xpath="/html/body/div[1]/div/div/div[1]/div/div/div/form/div[2]/input")
		WebElement pintextbox;
		
		public void sendpintextbox()
		{
			pintextbox.sendKeys("199720");
		}
		
		@FindBy(xpath="//button[@type='submit']")
		WebElement ContinueButton2;
		
		public void ClickContinueButton2()
		{
			ContinueButton2.click();
		}
		
		public POMClass_LoginFunctionality(WebDriver driver)
		{
			this.driver=driver;
			
			PageFactory.initElements(driver,this);
		}
		
	}


