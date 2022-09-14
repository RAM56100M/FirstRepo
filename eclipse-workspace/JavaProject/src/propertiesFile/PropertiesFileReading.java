package propertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class PropertiesFileReading {
	public static Properties prop;
  
  public static void getpropfile() throws IOException {
	  String path="C:\\Users\\RAM V. MARSHIVANE\\eclipse-workspace\\JavaProject\\ config.properties";
  prop= new Properties();
  FileInputStream fis= new FileInputStream(path);
  prop.load(fis);
  String UserName=prop.getProperty("Username");
  String pass= prop.getProperty("Password");
  System.out.println("Username is:"+UserName);
  System.out.println("Password is:"+pass);

  
  }
  public static void main(String[] args) throws IOException, InterruptedException {
	  getpropfile();
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys(prop.getProperty("Username"));
System.out.println(PropertiesFileReading.prop);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(prop.getProperty("Password"));
		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
		 Thread.sleep(4000);
		 
		//Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a/span")).click();
		 driver.findElement(By.cssSelector(".oxd-icon.bi-calendar.oxd-date-input-icon")).click();
  while(true)
  {
		 String s=driver.findElement(By.cssSelector(".oxd-calendar-selector-month-selected")).getText();
		 System.out.println("This year is:"+s);
		 if(!s.equalsIgnoreCase("December")) {
			 driver.findElement(By.cssSelector(".oxd-icon.bi-caret-down-fill.oxd-icon-button__icon")).click();}
		 else
		 {break;}
		 }

	  
  }
  }
