package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragDrop {
  @Test
  public void dd() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable/"); 
		WebElement from=driver.findElement(By.id("draggable"));
		WebElement to=driver.findElement(By.id("droppable"));

		Actions act= new Actions (driver);
		act.dragAndDrop(from, to).perform();
		String text=driver.findElement(By.xpath("//*[contains(text(),'Dropped')]")).getText();
		System.out.println(text);
		
  }
}
