package UITesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			//WebDriver driver= new FirefoxDriver();
			driver.manage().window().maximize();
			
		driver.get("https://vctcpune.com/selenium/practice.html");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.id("checkBoxOption1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkBoxOption2")).click();
		Thread.sleep(2000);

		WebElement cb=driver.findElement(By.id("checkBoxOption3"));
		//cb.click();
		if(cb.isEnabled()) {System.out.println("checkbox is enabled");}
		else {
			System.out.println("checkbox is not enabled");
		}
		if(cb.isSelected()) {System.out.println("checkbox is selected");}
		else {
			System.out.println("checkbox is not selected");
		}

		
	}

}
