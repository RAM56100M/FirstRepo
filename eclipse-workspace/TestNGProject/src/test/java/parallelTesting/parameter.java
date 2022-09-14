package parallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {
	WebDriver driver;
	@Parameters("Browser")
  @BeforeTest
  public void initBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			  driver = new ChromeDriver();
			    driver.manage().window().maximize();
				driver.get("https://vctcpune.com/selenium/practice.html");
		}
		else {
			System.setProperty("webdriver.edge.driver","C:\\Users\\RAM V. MARSHIVANE\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			  driver = new EdgeDriver();
			    driver.manage().window().maximize();
				driver.get("https://vctcpune.com/selenium/practice.html");
			
		}
		}
	@Test
	public void verifyTitle() {
		String title=driver.getTitle();
		System.out.println(title);
		String expTitle="Practice Page";
		Assert.assertEquals(title, expTitle);
		
  }
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
