package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			//WebDriver driver= new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.linkText("Forgotten password?")).click();
			
	}
}
//a[contains(text(),'Forgotten password?')]