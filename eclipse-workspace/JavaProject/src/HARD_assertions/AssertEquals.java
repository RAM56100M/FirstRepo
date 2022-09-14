package HARD_assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEquals {
  @Test
  
  public void Assertion() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 String exp_title="WelcomeToGoogle";
		 String act_title=driver.getTitle();
//		 if(exp_title.equalsIgnoreCase(act_title)) {
//			 System.out.println("Test csea passed");}
//		 else {
//			 System.out.println("Test case failed");
//		 }
 Assert.assertEquals(exp_title, act_title);  
  
  }
}
