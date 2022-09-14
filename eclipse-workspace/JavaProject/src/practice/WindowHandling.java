package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("tabButton")).click();
		String ParentHandle = driver.getWindowHandle();
		System.out.println(ParentHandle);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			System.out.println(handle);
			if (!handle.equals(ParentHandle)) {
				driver.switchTo().window(handle);
				String text = driver.findElement(By.id("sampleHeading")).getText();
				System.out.println(text);
			}
			driver.switchTo().window(ParentHandle);
			driver.findElement(By.id("windowButton")).click();
			String text1 = driver.findElement(By.id("sampleHeading")).getText();
			System.out.println(text1);

		}
	}
}