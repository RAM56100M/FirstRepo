import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM V. MARSHIVANE\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	
	//step-1 Launch browser
   driver=new ChromeDriver();
	
	//Step-2 Maximize window
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
	
	//step-3
	driver.get("https://jqueryui.com/datepicker/");
	Thread.sleep(2000);
	WebElement frame1=driver.findElement(By.className("demo-frame"));
	driver.switchTo().frame(frame1);
	driver.findElement(By.id("datepicker")).click();
	WebElement title=driver.findElement(By.xpath("//*[@class='ui-datepicker-title']"));
	String t=title.getText();
	System.out.println(t);
	while(true) {
		String month=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		
		if (!month.equalsIgnoreCase("March 2020")) {
		driver.findElement(By.xpath("//a[@title='Prev']")).click();
			
		} else {
			
			break;
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a[text()='10']"));
		
	}
	}
}
