package dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleTestData {
 WebDriver driver;
 @BeforeTest
 public void initBrowser() {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

 }
 @Test
 (dataProvider="testdata")
 public void loginTest(String user, String password) throws InterruptedException {
	 WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
	  username.sendKeys(user);
	  Thread.sleep(2000);
	  //step-2 enter pass
	  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
	  Thread.sleep(2000);
	  //step-3 click on button 
	  driver.findElement(By.xpath("//button[@name='login']")).click();
	  Thread.sleep(2000);
	  //step-4 go back
	  driver.navigate().back();
	  Thread.sleep(4000);
	  //step-5 clear username
	 driver.findElement(By.xpath("//input[@id='email']")).clear();
	  Thread.sleep(2000);
 }
 @DataProvider (name="testdata")
 public String [][] getData(){
	  String [][]data= {{"abc@gmail.com", "abc@123"},{"xyz@gmail.com", "xyz@123"},{"def@gmail.com","def@123"}};
return data;
	 
 }
}
