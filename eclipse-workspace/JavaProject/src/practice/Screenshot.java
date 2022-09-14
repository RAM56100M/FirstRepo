package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		TakesScreenshot tcs= (TakesScreenshot) driver;
		File srcfile= tcs.getScreenshotAs(OutputType.FILE);
		File DestFile= new File(".\\Screenshots\\sc2.png");
		FileHandler.copy(srcfile, DestFile);
		System.out.println("Screenshot is saved");
		
		//Partial Screenshot
		WebElement img= driver.findElement(By.xpath("//img[@class=\"lnXdpd\"]"));
		File src=img.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\Screenshots\\img2.png");
		FileHandler.copy(src, dest);
		System.out.println("Screenshot of image is captured");
		
	}
}