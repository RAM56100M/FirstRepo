package UITesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckboxStatus {
	@Test
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		WebElement checkbox=driver.findElement(By.cssSelector(".VfPpkd-muHVFf-bMcfAe"));
		checkbox.click();
		
		if(checkbox.isEnabled()) {
			System.out.println("checkbox is enable");
			System.out.println("test case is passed");
		}
		WebElement link=driver.findElement(By.xpath("//span[contains(text(),'Sign in instead')]"));
		System.out.println(link.getTagName());
		
		if(link.equals("a")) {
			System.out.println("is link");}
		else
			System.out.println("not link");
		}
	}

