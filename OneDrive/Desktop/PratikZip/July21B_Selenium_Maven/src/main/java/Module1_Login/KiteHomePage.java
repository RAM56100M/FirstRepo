package Module1_Login;
//pom class 3   // regular class

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	@FindBy(xpath="//span[@class='user-id']")	private WebElement userID;
	@FindBy(xpath="//a[text()=' Logout']")	private WebElement logoutBtn;


	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String getKiteHomePageUserID()
	{
	    String userIDValue = userID.getText();
		return userIDValue;
	}
	
	
	public void clickKiteHomePageLogoutBtn() 
	{
		logoutBtn.click();
	}
	
	public void clickKiteHomePageUserID() 
	{
		userID.click();
	}
	
	
	
	
//	public void verifyKiteHomePageUserId(String expUserIDInfo) 
//	{
//		String actUserID = userID.getText();
//		
//		if(actUserID.equals(expUserIDInfo)) 
//		{
//			System.out.println("Pass");
//		}
//		else 
//		{
//			System.out.println("Fail");
//		}		
//	}
		
}
