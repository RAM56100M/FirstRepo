package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners
public class Listener2 {
 public static WebDriver driver;
 @BeforeTest
 public void InitBrowser(){
	 System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
 }
 @Test(priority=1)
 public void Login() throws InterruptedException{
	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Admin");
	 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("admin1234");
	 driver.findElement(By.id("loginbutton")).click();
	 Thread.sleep(4000);
	 
	 //We are Forcefully Fail this test case
	 Assert.assertTrue(false);
 }
	 @Test(priority=2)
	 public void homepage() throws InterruptedException 
	 {
	 System.out.println("This is second test case which is for Homepage");
	 Thread.sleep(4000);
	 Assert.assertTrue(false);
	 }	 
 }
 

