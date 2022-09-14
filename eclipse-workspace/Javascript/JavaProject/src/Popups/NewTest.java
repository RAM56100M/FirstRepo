package Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void Alert() {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			//WebDriver driver= new FirefoxDriver();
			driver.manage().window().maximize();
			
			driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");

  }
}
