package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait1 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().window().maximize();
		String s1=driver.findElement(By.id("h2")).getText();
		System.out.println(s1);
		driver.findElement(By.id("populate-text")).click();
		while (true) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12000));
		
		wait.until(ExpectedConditions.alertIsPresent());
Thread.sleep(15000);
		String s=driver.findElement(By.id("h2")).getText();
		System.out.println(s);
		
		}
	}
}