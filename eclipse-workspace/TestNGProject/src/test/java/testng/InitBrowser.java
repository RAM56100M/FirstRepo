package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class InitBrowser {
	WebDriver driver;
  @BeforeSuite
  public void initBrowser() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");

	   }
  @Test
  public void verifyTitle() throws InterruptedException {
	  String actTitle=driver.getTitle();
	  System.out.println(actTitle);
	  String expTitle="Practice Page";
	  Assert.assertEquals(actTitle, expTitle);	 
	  
  }
  @AfterSuite
  public void teardown() {
	  driver.close();
  }
}
