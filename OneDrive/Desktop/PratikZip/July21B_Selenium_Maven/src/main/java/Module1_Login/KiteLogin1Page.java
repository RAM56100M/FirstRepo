package Module1_Login;
//pom class 1  // regular class

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page 
{	
	@FindBy(xpath="//input[@id='userid']")	private	WebElement UN;  //private WebElement UN=driver.findElement(By.xpath(""));
	@FindBy(xpath="//input[@id='password']")	private	WebElement PWD; //private WebElement PWD=driver.findElement(By.xpath(""));
	@FindBy(xpath="//button[text()='Login ']")	private	WebElement LoginBtn; //private LoginBtn UN=driver.findElement(By.xpath(""));

	public	KiteLogin1Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
	
	//enter Username
	public void inpKiteLogin1PageUsername(String username)
	{
		UN.sendKeys(username);
	}
		
	//enter PWD
	public void inpKiteLogin1PagePassword(String password) 
	{
		PWD.sendKeys(password);
	}
	
	//Click On LoginBtn
	public void clickKiteLogin1PageLoginBtn()
	{
		LoginBtn.click();
	}
	
	
	
}
