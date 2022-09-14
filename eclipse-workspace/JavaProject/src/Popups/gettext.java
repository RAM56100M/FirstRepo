package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class gettext {
  @Test
  public static void homepage() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.cssSelector("input[name='cusid']")).sendKeys("dhdhch");
		driver.findElement(By.cssSelector("input[type=submit]")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();

		

		
		
}
}