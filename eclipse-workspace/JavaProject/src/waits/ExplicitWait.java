package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	driver.manage().window().maximize();
	driver.findElement(By.id("alert")).click();
	WebDriverWait wait=new WebDriverWait(driver,5000);
	wait.until(ExpectedConditions.alertIsPresent());
	 
	String s= driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
	System.out.println(s);

}
}