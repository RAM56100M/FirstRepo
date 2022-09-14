package alertHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Accept {
	public static WebDriver driver;
	@BeforeTest
	public void initBriwser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM V. MARSHIVANE\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			   driver=new ChromeDriver();
				driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.get("https://vctcpune.com/selenium/practice.html");
	}
  @Test
  public void okAlert() throws InterruptedException {
	  JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,700)");
	  WebElement alertBtn=driver.findElement(By.id("alertbtn"));
	  alertBtn.click();
	  Thread.sleep(2000);
	 Alert alertwindow= driver.switchTo().alert();
	 System.out.println(alertwindow.getText());

	 alertwindow.accept();
	 Thread.sleep(4000);
  }
  @Test
  public void conformAlert() {
	  WebElement ab=driver.findElement(By.id("confirmbtn"));
	  ab.click();
	  System.out.println(driver.switchTo().alert().getText());
	  driver.switchTo().alert().accept();
	  
  }
  @Test
  public void nameAlert() {
	  driver.findElement(By.id("name")).sendKeys("Ram");
	  WebElement alrtbtn=driver.findElement(By.id("confirmbtn"));
	  alrtbtn.click();
	  String text=driver.switchTo().alert().getText();
	  System.out.println(text);
	  driver.switchTo().alert().accept();
  }
}
