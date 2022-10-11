package pomClasses_SauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClassAlertPopUp 
{
  private WebDriver driver;
   
   @FindBy(xpath="//button[@id='alertButton']")
   private WebElement ClickMe;
   
   public void Clickedclickmebutton()
   {
	   ClickMe.click();
   }
   
   @FindBy(xpath="//button[@id='alertButton']")
   private WebElement ClickMebutton2;
   
   public void Clickedclickmebutton2()
   {
	   ClickMebutton2.click();
   }
   
   @FindBy(xpath="//button[@id='confirmButton']")
   private WebElement ClickMe3;
   
   public void Clickedclickmebutton3()
   {
	   ClickMe3.click();
   }
   
   @FindBy(xpath="//button[@id='promtButton']")
   private WebElement ClickMe4;
   
   public void Clickedclickmebutton4()  
   {
	   ClickMe4.click();
	   
   }
   
   
   public POMClassAlertPopUp(WebDriver driver)
   {
	   this .driver=driver;
	   
	   PageFactory.initElements(driver,this);
   }
	
}
