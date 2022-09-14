package actionsClass;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabs {
	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		driver.get("https://www.amazon.in/"); 
    WebElement tabs=driver.findElement(By.cssSelector(".navLeftFooter.nav-sprite-v1"));
    System.out.println(tabs.findElements(By.tagName("a")).size());
		for(int i=0;i<=tabs.findElements(By.tagName("a")).size()-1;i++) {
			String keys=Keys.chord(Keys.CONTROL,Keys.ENTER);
			tabs.findElements(By.tagName("a")).get(i).sendKeys(keys);
		}
		Set<String> windows=driver.getWindowHandles();
		for(String window:windows ) {
			driver.switchTo().window(window);
			String title=driver.getTitle();
			System.out.println(title);
		}
	
	}
}