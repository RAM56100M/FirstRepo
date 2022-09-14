package stringPrograms;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.amazon.in/"); 
		    WebElement tabs=driver.findElement(By.cssSelector("navFooterLinkCol.navAccessibility"));
		    System.out.println(tabs.findElements(By.tagName("a")).size());
				for(int i=0;i<=tabs.findElements(By.tagName("a")).size()-1;i++) {
					String keys=Keys.chord(Keys.CONTROL,Keys.ENTER);
					tabs.findElements(By.tagName("a")).get(i).sendKeys(keys);
				}
		    Set<String> windowhandles= driver.getWindowHandles();
		    int count=windowhandles.size();
		    System.out.println(count);
		    for(String windowhandle:windowhandles) {
		    	driver.switchTo().window(windowhandle);
		    	String title=driver.getTitle();
		    	System.out.println(title);
		    	System.out.println(windowhandle);
		    }

}
}