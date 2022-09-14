package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InstantAlert {
  @Test
  public void alert() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/alerts"); 
					
			WebElement btn=driver.findElement(By.id("alertButton"));
			btn.click();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
  }
}
