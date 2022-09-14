package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LaunchGmailUsingParameters {
  WebDriver driver;
  @BeforeTest
  @Parameters("browser")
  public void browserTest(String s) {
	 if(s.equalsIgnoreCase("Chrome")) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://accounts.google.com/");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
	 }
  
  }
}
