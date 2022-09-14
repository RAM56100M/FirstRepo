package windowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHour {
  @Test
  public static void main(String[] args) throws
  InterruptedException {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
   
   driver.manage().window().maximize();
   
   driver.get("https://www.amazon.in/");
   Thread.sleep(2000);
   
   Actions ac=new Actions(driver);
   
   WebElement hover=driver.findElement(By.xpath("//*[@id=\"nav-belt\"]/div[3]/div/a/span[1]/span/span[@class='nav-icon nav-arrow']"));
   
   ac.moveToElement(hover).perform();
   
//   WebElement Sub_part=driver.findElement(By.xpath("//*[text()='Main Item 2']//following::a[2]"));
//   Sub_part.click();
   
  

  }
}
