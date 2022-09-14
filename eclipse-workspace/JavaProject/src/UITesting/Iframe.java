package UITesting;

import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Iframe {
	@Test
	public static void homepage() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			//WebDriver driver= new FirefoxDriver();
			driver.manage().window().maximize();
	
	
	driver.get("https://vctcpune.com/selenium/practice.html");
	 
//	//Finding all iframe tags on a web page
//	List<WebElement> elements = driver.findElements(By.tagName("iframe"));
//	int numberOfTags = elements.size();
//	System.out.println("No. of Iframes on this Web Page are: " +numberOfTags);
//	 
//	if(numberOfTags==0) {
//		System.out.println("No Frame Present");
//	}
//	driver.quit();
	
	
	WebElement text=driver.findElement(By.xpath("//*[contains(text(),'iFrame Example')]"));
	int xcoordinates=text.getLocation().getX();
	int ycoordinates=text.getLocation().getY();
	System.out.println(xcoordinates);
	System.out.println(ycoordinates);
	JavascriptExecutor js=  (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,3128)");
	Thread.sleep(3000);

	driver.switchTo().frame(driver.findElement(By.id("courses-iframe")));
	driver.findElement(By.xpath("//*[@id='et-top-navigation']/nav")).click();
	Thread.sleep(3000);

	Thread.sleep(3000);
	driver.findElement(By.cssSelector(".et-search-field")).sendKeys("HII Velocity");
	
	
	
	}
}
