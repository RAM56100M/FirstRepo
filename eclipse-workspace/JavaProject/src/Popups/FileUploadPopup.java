package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadPopup {
  @Test
  public static void homepage() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RAM V. MARSHIVANE\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/upload/");
		WebElement upload=driver.findElement(By.xpath("//*[@name='uploadfile_0']"));
		upload.sendKeys("C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\RVM2.10.pdf");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='res']/center")).getText());
		
}
}