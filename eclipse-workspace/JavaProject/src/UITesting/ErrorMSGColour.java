package UITesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class ErrorMSGColour {
	@Test
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://m.facebook.com/login/?refsrc=deprecated&_rdr");
		Thread.sleep(2000);
		driver.findElement(By.id("m_login_email")).sendKeys("RAM123Mcom");
		driver.findElement(By.xpath("//*[@type=\"password\"]")).sendKeys("Ram8746");
		driver.findElement(By.xpath("//*[@type=\"button\"]")).click();
		Actions act= new Actions(driver);
		
		

}
}