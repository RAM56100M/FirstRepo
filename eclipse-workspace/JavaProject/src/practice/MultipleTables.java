package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTables {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	//WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://info.sice.indiana.edu/~hrosenba/Demo/Demo2.html");
	List<WebElement> links=driver.findElements(By.tagName("a"));
	int count=links.size();
	System.out.println(count);
	for (int i=0; i<=links.size();i++) {
System.out.println(links.get(i).getAttribute("href"));
System.out.println(links.get(i).getText());
links.get(i).click();

	}
	}
}
