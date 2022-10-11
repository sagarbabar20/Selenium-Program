package pomClass_ZerodhaKite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClassHomePage 
{
	private WebDriver driver;
	Actions act=new Actions(driver);

	@FindBy(xpath="//button[@class='button-blue buy']")
	private WebElement BuyButton;

	public void ClickBuybutton()
	{
		act.moveToElement(BuyButton).click().perform();
		
	}
	
	public POMClassHomePage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	

}
