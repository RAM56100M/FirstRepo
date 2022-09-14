package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAround {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/"); 
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@class=\"demo-frame\"]")));
		WebElement drag=driver.findElement(By.id("draggable"));
		Actions act= new Actions(driver);
		act.dragAndDropBy(drag,140,160).build().perform();
		
  	}
}
