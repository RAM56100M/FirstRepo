package UITesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
@Test
public class ContextClick {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		Actions act= new Actions(driver);
		//act.contextClick(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"))).build().perform();
		WebElement link=driver.findElement(By.xpath("//a[contains(text(),' How Search works ')]"));
	Actions act1=new Actions(driver);
	Thread.sleep(2000);
	act.moveToElement(link).build().perform();
	}
}