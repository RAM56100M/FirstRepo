package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(5000);
		WebElement dd=driver.findElement(By.xpath("//select[@id=\"oldSelectMenu\"]"));
		
		 WebElement dropDown = driver.findElement( By.xpath("//select[@id=\"oldSelectMenu\"]"));
		    dropDown.click();
		    List<WebElement> allOptions = dropDown.findElements(By.xpath(".//option"));
		    for ( WebElement we: allOptions) { 
		        dropDown.sendKeys( Keys.DOWN ); //simulate visual movement
		        Thread.sleep(250);
		        System.out.println(we);
		        System.out.println(allOptions);
		    }
		
		}
}