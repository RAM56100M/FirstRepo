import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testriqq {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	String url1="https://www.google.co.in/";
		driver.get(url1);
	
		 WebElement textbox= driver.findElement(By.xpath("//*[@class='gLFyf gsfi']"));
		 textbox.sendKeys("Testriq");
		  Thread.sleep(3000);
		 List<WebElement> dd= driver.findElements(By.xpath("//*[@class='aajZCb']"));
		 for(WebElement d:dd) {
			 System.out.println(d.getText());
		 }
Thread.sleep(2000);
		 textbox.sendKeys(Keys.ENTER);
WebElement link=driver.findElement(By.tagName("a"));
System.out.println(link.getSize());

	  }
	
}
