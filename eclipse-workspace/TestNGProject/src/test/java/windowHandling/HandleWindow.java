package windowHandling;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleWindow {
	static WebDriver driver;
 @BeforeTest
 public void initBrowser() {
	 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM V. MARSHIVANE\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://vctcpune.com/selenium/practice.html");
 }
 @Test
 public void tabHandling(){
		String parentTab=driver.getWindowHandle();
System.out.println(parentTab);
	 driver.findElement(By.id("opentab")).click();
	 Set<String> alltabs=driver.getWindowHandles();
	 for(String tab:alltabs) {
		 if(!tab.equalsIgnoreCase(parentTab)) {
			 driver.switchTo().window(tab);
			 String title=driver.getTitle();
				System.out.println(title);
		 }
	 }
	
 }
}
