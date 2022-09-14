package UITesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
	driver.get("https://vctcpune.com/selenium/practice.html");
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,300)");
	String s=driver.findElement(By.xpath("//*[@value=\"Radio4\"]")).getText();
	System.out.println("text on button is"+s);
	driver.findElement(By.xpath("//*[@value=\"Radio4\"]")).click();
	}
	}