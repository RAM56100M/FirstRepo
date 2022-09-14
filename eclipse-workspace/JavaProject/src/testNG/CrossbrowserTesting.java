package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossbrowserTesting {
	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void BrowserTest(String s)
	{
	if(s.equalsIgnoreCase("Chrome"))
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://accounts.google.com/");
	driver.manage().window().maximize();
	}
	else if(s.equalsIgnoreCase("Firefox"))
	{
	System.setProperty("webdriver.gecko.driver","C:\\Users\\RAM V. MARSHIVANE\\Downloads\\geckodriver-v0.31.0-win32.exe");
	driver=new FirefoxDriver();
	driver.get("https://accounts.google.com/");
	driver.manage().window().maximize();
	}
	}
	@Test
	public void WebpageTitle()
	{
	String title=driver.getTitle();
	System.out.println("Title of Web Page is:" +title);
	}
	 }

