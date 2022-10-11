package pomClasses_SauceDemo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClassMultipleProduct
{
	private WebDriver driver;
	
	//2.element find
		@FindBy(xpath="//input[@id='user-name']")
		private WebElement username;
		
		public void sendusername()
		{
			username.sendKeys("standard_user");
		}
		
		@FindBy(xpath="//input[@id='password']")
		private WebElement password;
		
		public void sendpassword()
		{
			password.sendKeys("secret_sauce");
		}
		
		@FindBy(xpath="//input[@id='login-button']")
		private WebElement Loginbutton;
		
		public void clickonLoginbutton()
		{
			Loginbutton.click();
		}


	@FindBy(xpath="//button[text()='Add to cart']")
	List<WebElement> allproduct;
	public void clickAllProduct()
	{
		for(WebElement i: allproduct)
		{
			i.click();
		}	
	}
	
	public POMClassMultipleProduct(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}


}
