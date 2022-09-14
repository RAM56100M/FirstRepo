package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AcceptCancel {
  @Test
  public void accept() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html#"); 
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");		
		WebElement btn=driver.findElement(By.id("confirmbtn"));
		btn.click();
		Thread.sleep(2000);

		driver.switchTo().alert().accept();}
  
		@BeforeMethod
		  public void dismiss() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html#"); 
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");	
		
		
		Thread.sleep(3000);
		WebElement btn1=driver.findElement(By.id("confirmbtn"));
		btn1.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
  }
}
