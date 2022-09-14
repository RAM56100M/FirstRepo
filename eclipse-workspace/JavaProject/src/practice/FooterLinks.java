package practice;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		List<WebElement> elements=driver.findElements(By.xpath("//div[@class=\"_2WErco row\"]"));
				
		for(WebElement elem:elements){
		System.out.println(elem.getText());
		}
		}
	}
