package stringPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.w3schools.com/html/html_tables.asp");
		   // driver.findElement(By.cssSelector(".w3-white.w3-padding.notranslate.w3-padding-16"));
		    List<WebElement> allrows=driver.findElements(By.xpath("//tr"));
		    int count=allrows.size();
		    System.out.println("Total number of rows in table is:" +count);
		    List<WebElement> allcolumn=driver.findElements(By.xpath("//th"));
		    int count1=allcolumn.size();
		    System.out.println("Total number of columns in table is:" +count1);
		    List<WebElement> allcell=driver.findElements(By.xpath("//th| //tr"));
		    int count2=allcolumn.size();
		    System.out.println("Total number of cells in table is:" +count2);
		    

}
}