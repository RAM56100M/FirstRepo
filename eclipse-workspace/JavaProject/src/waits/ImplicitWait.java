package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(4000,TimeUnit.SECONDS);
}
}
