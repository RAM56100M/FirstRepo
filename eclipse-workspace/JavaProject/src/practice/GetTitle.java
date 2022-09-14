package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			//WebDriver driver= new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.toolsqa.com/selenium-webdriver/alerts-in-selenium/");
			String title=driver.getTitle();
			System.out.println(title);
//			Thread.sleep(3000);
//			driver.close();
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getPageSource());//			
	}

}
