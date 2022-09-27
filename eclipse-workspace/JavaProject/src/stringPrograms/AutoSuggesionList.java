package stringPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggesionList {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RAM V. MARSHIVANE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//*[@type=\"text\"]")).sendKeys("microsoft");
		Thread.sleep(3000);
		List<WebElement> allsug = driver.findElements(By.xpath("//*[starts-with(text(),'microsoft')]"));
		//List<WebElement> allsug = driver.findElements(By.xpath("//*[@class='aajZCb']"));
		
		int count = allsug.size();
		System.out.println(count);
		for(WebElement sug:allsug) {
			String text=sug.getText();
			System.out.println(text);
			if(text.equalsIgnoreCase("microsoft 365 login")) {
				sug.click();
				break;
			}
		}
	}
}