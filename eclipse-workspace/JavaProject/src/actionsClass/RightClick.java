package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClick {
  @Test
  public void doubleclick() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons"); 
		WebElement btn=driver.findElement(By.id("rightClickBtn"));
		Actions act= new Actions (driver);
		act.contextClick(btn).perform();
		String s= driver.findElement(By.id("rightClickMessage")).getText();
		System.out.println(s);
  }
}
