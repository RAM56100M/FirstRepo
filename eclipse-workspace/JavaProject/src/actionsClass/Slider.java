package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Slider {
  @Test
  public void slider() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/"); 
		WebElement frame=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		WebElement btn=driver.findElement(By.cssSelector(".ui-slider-handle.ui-corner-all.ui-state-default"));
		
		Actions act= new Actions (driver);
		act.clickAndHold(btn).moveByOffset(150,0).release().perform();
		Thread.sleep(2000);
		act.clickAndHold(btn).moveByOffset(-140, 0).perform();
  }
}
