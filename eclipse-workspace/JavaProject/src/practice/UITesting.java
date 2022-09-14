package practice;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UITesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		WebElement login=driver.findElement(By.id("email"));
		int login_x=login.getLocation().getX();
		int login_width=login.getSize().getHeight();
		int login_height=login.getSize().getWidth();
		WebElement pass=driver.findElement(By.id("pass"));
		int p_x=pass.getLocation().getX();
		int p_width=pass.getSize().getHeight();
		int p_height=pass.getSize().getWidth();
		System.out.println(login_x);
		System.out.println(login_width);
		System.out.println(login_height);

		System.out.println(p_x);

		System.out.println(p_width);

		System.out.println(p_height);

		if(login_x==p_x &&login_width==p_width &&login_height==p_height) {
			System.out.println("Login and password are correctly aligned");
		}
		else {
			System.out.println("Login and password are not correctly aligned");
		}



		

		}
		}
