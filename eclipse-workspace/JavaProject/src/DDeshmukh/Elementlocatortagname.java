package DDeshmukh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementlocatortagname {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception  {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	    driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.findElement(By.tagName("button")).click();
}
}