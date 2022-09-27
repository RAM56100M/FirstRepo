package windowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Iterators {
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
Set<String> handler=driver.getWindowHandles();
Iterator<String> it=handler.iterator();
String parentwindowid=it.next();
System.out.println(parentwindowid);
String allwindowhandle=it.next();
driver.switchTo().window(allwindowhandle);
System.out.println("Child window title is:" + driver.getTitle());
driver.close();
}
}