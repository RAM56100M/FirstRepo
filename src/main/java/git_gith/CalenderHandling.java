package git_gith;
//datepicker
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalenderHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chromedriver", "C:\\Users\\RAM V. MARSHIVANE\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		String url="https://www.redbus.in/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		driver.findElement(By.id("src")).sendKeys("ramm");
		driver.findElement(By.xpath("//div[@class='fl search-box date-box gtm-onwardCalendar']")).click(); 
		driver.findElement(By.xpath("//table/tbody/tr[5]/td[5]")).click();
	}

}
//running successfully
