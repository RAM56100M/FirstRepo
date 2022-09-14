package windowHandling;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class allLinks {
	static WebDriver driver;

	@BeforeTest
	public void initBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RAM V. MARSHIVANE\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");

	}

	@Test
	public void getAllLinks() {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count = links.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			System.out.println("Name of Link# " + i + links.get(i).getText());
		}
		 for(int i=0;i<links.size();i++)
	        {
	            WebElement E1= links.get(i);
	            String url= E1.getAttribute("href");
	            verifyLinks(url);
	        }

	}

	@Test
	public static void verifyLinks(String linkUrl) {
		try {
			URL url = new URL(linkUrl);
			HttpURLConnection httpurlConnect = (HttpURLConnection) url.openConnection();
			httpurlConnect.setConnectTimeout(5000);
			httpurlConnect.connect();
			if (httpurlConnect.getResponseCode() >= 400) {
				System.out.println(linkUrl + " - " + httpurlConnect.getResponseMessage() + "is a broken link");
			}

			// Fetching and Printing the response code obtained
			else {
				System.out.println(linkUrl + " - " + httpurlConnect.getResponseMessage());
			}
		} catch (Exception e) {
		}
	}
}
