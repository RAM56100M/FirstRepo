package abcinterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://demoqa.com/alerts");
		    driver.findElement(By.id("timerAlertButton")).click();
//		    WebDriverWait wait = new WebDriverWait (driver,6);
//		    wait.until(ExpectedConditions.alertIsPresent());
		    WebDriverWait wait = new WebDriverWait(driver, 7);
		    wait.until(ExpectedConditions.alertIsPresent()).accept();
		    
}
}
