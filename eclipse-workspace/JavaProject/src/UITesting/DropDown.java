package UITesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
	driver.get("https://vctcpune.com/selenium/practice.html");
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,300)");
		WebElement dd=driver.findElement(By.id("dropdown-class-example"));
		
		Select s= new Select(dd);
		//s.selectByIndex(1);
		Thread.sleep(3000);
		//s.selectByVisibleText("Option2");
		s.selectByValue("option3");
			
		}
}
