package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {
	static WebDriver driver;
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\RAM V. MARSHIVANE\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	//System.out.println(driver.findElement(By.xpath("//*[@id='content']")).getText());
	System.out.println(driver.getTitle());
}
}