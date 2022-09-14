package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleAlertEnteringValue {
  @Test
  public void HandleAlertEnteringValue() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html#"); 
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");	
		driver.findElement(By.id("name")).sendKeys("Marshivane");
		Thread.sleep(2000);
		WebElement btn=driver.findElement(By.id("confirmbtn"));
		btn.click();
		Thread.sleep(2000);

		driver.switchTo().alert().accept();
		System.out.println(btn.getText());
  }
}
