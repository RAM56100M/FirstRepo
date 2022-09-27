package DDeshmukh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetURL  {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception  {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	    driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
String title=driver.getTitle();
System.out.println(title);
if(title.contains(" in or sign up")) {
	System.out.println("Testcase is passed");
}else {
	System.out.println("Test case failed");
	Thread.sleep(2000);
}
driver.close();
}

}