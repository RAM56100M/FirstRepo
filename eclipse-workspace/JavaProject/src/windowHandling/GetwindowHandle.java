package windowHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GetwindowHandle {
	@Test
	public void HandleAlertEnteringValue() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html#");
		String parent = driver.getWindowHandle();
		System.out.println("Parent ID:" + parent);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(3000);

		driver.findElement(By.id("opentab")).click();
		Set<String> all_tabs = driver.getWindowHandles();
		for (String id : all_tabs) {
			System.out.println(id);
			if (!parent.equalsIgnoreCase(id)) {
				driver.switchTo().window(id);
				String title = driver.getTitle();
				System.out.println(title);
				
			}
			driver.switchTo().window(parent);
			String url = driver.getCurrentUrl();
			System.out.println(url);
			 	

		}
	}

}
