package UITesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DropandDrag {
  @Test
  public void Dropdrag() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement dr=driver.findElement(By.xpath("//div[@id='products']/div/ul/li[5]"));
		WebElement drop=driver.findElement(By.xpath("//li[@class='placeholder']"));
		Actions act= new Actions(driver);
		act.dragAndDrop(dr, drop).build().perform();
		
  }
}
