package Soft_assert;

import static org.testng.Assert.assertTrue;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEquals {
  @Test
  public void SoftAssert() {
  System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://accounts.google.com/");
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");

	String title=driver.getTitle();
	SoftAssert as=new SoftAssert();
	 
	 as.assertEquals(title,"gmail");
	 
	 System.out.println("Title is :" +title);
	 System.out.println("Last Assert statement");
	 as.assertAll();
	 
	 System.out.println("Last Assert statement");
	 
	 }
	
  }
