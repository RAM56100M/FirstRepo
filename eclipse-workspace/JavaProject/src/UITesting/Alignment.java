package UITesting;

import org.testng.annotations.Test;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alignment {
	@Test
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		Thread.sleep(2000);
		WebElement fn=driver.findElement(By.id("firstName"));
		int fn_x=fn.getLocation().getX();
		WebElement ln=driver.findElement(By.id("lastName"));
		int ln_x=fn.getLocation().getX();
		System.out.println(fn_x);
		System.out.println(ln_x);

		if(fn_x==ln_x){
			System.out.println("First name and Last name are in same line");}else
				System.out.println("First name and Last name are not in same line");
			
		}
		}
		
	
