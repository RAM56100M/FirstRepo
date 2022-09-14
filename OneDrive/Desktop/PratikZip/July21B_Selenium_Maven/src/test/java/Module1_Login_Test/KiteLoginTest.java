package Module1_Login_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import Module1_Login.KiteHomePage;
import Module1_Login.KiteLogin1Page;
import Module1_Login.KiteLogin2Page;

public class KiteLoginTest extends BaseClass
{	
	KiteLogin1Page login1;
	KiteLogin2Page login2;
	KiteHomePage home;
	int TestCaseID;
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException 
	{					
		initializeBrowser();
	    login1=new KiteLogin1Page(driver);
	    login2=new KiteLogin2Page(driver);
		home=new KiteHomePage(driver);		
	}
	
	@BeforeMethod
	public void loginToApp() throws EncryptedDocumentException, IOException
	{
		login1.inpKiteLogin1PageUsername(UtilityClass.getDataFromPF("UN"));
		login1.inpKiteLogin1PagePassword(UtilityClass.getDataFromPF("PWD"));
		login1.clickKiteLogin1PageLoginBtn();
		login2.inpKiteLogin2PagePin(UtilityClass.getDataFromPF("PIN"));
		login2.clickKiteLogin2PageCntBtn();
	}
	
	@Test
	public void verifyUserID() throws EncryptedDocumentException, IOException
	{
		TestCaseID = 200;
		String actResult= home.getKiteHomePageUserID();
		String expResult=  "QR7144"; //UtilityClass.getTD(0, 3);
		
		Assert.assertEquals(actResult, expResult,"Failed: both result are diffrent: ");		
	}
		
	@AfterMethod
	public void logoutFromApp(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE) 
		{
			UtilityClass.captureScreenshot(driver, TestCaseID);
		}		
		
		//home.clickKiteHomePageUserID();
		//home.clickKiteHomePageLogoutBtn();
	}
		
//	@AfterClass
//	public void closeBrowser() throws InterruptedException 
//	{
//		Thread.sleep(3000);
//		driver.close();
//		driver =null;
//		login1=null;
//		login2=null;
//		home=null;
//	}
	

}
