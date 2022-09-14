package practice;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	//WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.deadlinkcity.com/");
	List<WebElement> links=driver.findElements(By.tagName("a"));
	for(WebElement link:links) {
		String url=link.getAttribute("href");
		if(url==null ||url.isEmpty()) {
			System.out.println("url is empty");
			continue;			
		}
		URL u =new URL(url);
		HttpURLConnection http=(HttpURLConnection) u.openConnection();
		http.connect();{
			if(http.getResponseCode()>=400) {
				System.out.println(u +"is broken");
			}
			else
			{
				System.out.println(u+ "link is valid");
			}
		}
	}
}
}
