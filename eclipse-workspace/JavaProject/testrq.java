import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testrq {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver  driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
String url1="https://testriq.com/";
	driver.get(url1);

 
  public void getalllinks() {
	  driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys("Testriq");
	  
  }
}
