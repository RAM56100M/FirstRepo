import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testriq {
	public static boolean isUrlValid(String url) {
	      try {
	         URL obj = new URL(url);
	         obj.toURI();
	         return true;
	      } catch (MalformedURLException e) {
	         return false;
	      } catch (URISyntaxException e) {
	         return false;
	      }
	   }
public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	String url1="https://testriq.com/";
		driver.get(url1);
		List <WebElement> Totallink=driver.findElements(By.tagName("a"));
		int count=Totallink.size();
		System.out.println(count);
		
		for(WebElement link:Totallink) {
			String url=link.getAttribute("href");
			if(url==null ||url.isEmpty()) {
				System.out.println("url is empty");
				continue;
				
			}
			if(isUrlValid(url)) {
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
}
