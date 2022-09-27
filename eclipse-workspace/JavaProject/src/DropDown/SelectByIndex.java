package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import stringPrograms.BaseClass;

public class SelectByIndex   {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception  {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	    driver.manage().window().maximize();
driver.get("https://vctcpune.com/selenium/practice.html");
JavascriptExecutor js= (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,400)");
WebElement dd=driver.findElement(By.id("dropdown-class-example"));

Select s= new Select(dd);
List<WebElement> options = s.getOptions();
int size = options.size();
s.selectByVisibleText("Option3");
for(int i =0; i<size ; i++){
   String option = options.get(i).getText();
   System.out.println(option);
}
WebElement radio=driver.findElement(By.xpath("//*[@class=' extradiv col-lg-3 col-md-6 col-12']"));
System.out.println(radio.getText());
Select s1= new Select (radio);
s1.selectByIndex(2);
}
}