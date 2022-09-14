package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTesting {
	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void BrowserTest(String s)
	{
		if(s.equalsIgnoreCase("chrome")){
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.get("https://accounts.google.com/");
				driver.manage().window().maximize();
		}
		else if(s.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://accounts.google.com/");
			driver.manage().window().maximize();
			
		}
}
}