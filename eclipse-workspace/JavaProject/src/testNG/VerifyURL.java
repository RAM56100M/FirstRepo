package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class VerifyURL {
	WebDriver driver;

	@BeforeSuite
	public void initBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
		 driver= new ChromeDriver();
		
		driver.manage().window().maximize();
	}

	@BeforeClass
	public void navigatepage()
	{
	driver.get("https://www.google.com/");
	}
	@BeforeMethod
	public void beforemethod()
	{
	System.out.println("Before method is running");
	}

	@Test
	 public void VerifyTitleofPage() {
	 String title=driver.getTitle();
	 
	 if(title.equalsIgnoreCase("Google"))
	 {
		 System.out.println("Title is matched");
	 }
	 else
	 {
	 System.out.println("Title is not matched");
	 }
	 }
	 @Test
	 public void VerifyUrlofPage()
	 {
	 String URL=driver.getCurrentUrl();
	 if(URL.equalsIgnoreCase("https://www.google.com/"))
	 {
	 System.out.println("URL is matched");
	 }
	 else
	 {
	 System.out.println("URL is not matched");
	 }
	 
	 }

}
