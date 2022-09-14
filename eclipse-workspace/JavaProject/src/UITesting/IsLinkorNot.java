package UITesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IsLinkorNot {
	@Test
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=google&oq=google&aqs=chrome..69i57j69i60l2.2009j0j7&sourceid=chrome&ie=UTF-8");
		WebElement img=driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[1]/div[1]/div[1]/a/img"));
		
		if(img.equals(driver.findElement(By.tagName("img")))) {
			System.out.println("image is present");
		}
		
		else
			System.out.println("image not present");
		}
	}

