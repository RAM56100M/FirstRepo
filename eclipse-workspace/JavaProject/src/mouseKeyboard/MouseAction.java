package mouseKeyboard;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseAction {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RAM V. MARSHIVANE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement button=driver.findElement(By.id("tabButton"));
		Robot r= new Robot();
		r.mouseMove(200,300);
		r.keyPress(KeyEvent.VK_TAB);
	}
}