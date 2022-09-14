package stringPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://demo.guru99.com/test/newtours/register.php");
		    WebElement dd=driver.findElement(By.xpath("//*[@name='country']"));
		    Select s= new Select(dd);		     
List <WebElement> dd1=s.getOptions();
System.out.println(dd1);

}
}