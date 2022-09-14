package Module1_Login;
//pom class 2   // regular class

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page 
{
	@FindBy(xpath="//input[@id='pin']")	private	WebElement PIN;
	@FindBy(xpath="//button[text()='Continue ']")	private	WebElement CntBtn;


	public KiteLogin2Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//enter Pin
	public void inpKiteLogin2PagePin(String pinValue)
	{
		PIN.sendKeys(pinValue);
	}
	
	public void clickKiteLogin2PageCntBtn()
	{
		CntBtn.click();
	}
	
}
