package mouseKeyboard;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RAM V. MARSHIVANE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		TakesScreenshot tc= (TakesScreenshot) driver;
		File srcFile=tc.getScreenshotAs(OutputType.FILE);
		File DestFile= new File(".//Screenshots//google1.png");
		FileUtils.copyFile(srcFile, DestFile);
	}
}