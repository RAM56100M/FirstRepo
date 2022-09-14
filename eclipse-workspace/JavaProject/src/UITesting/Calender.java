package UITesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
	driver.get("https://jqueryui.com/resources/demos/datepicker/other-months.html");
	driver.findElement(By.id("datepicker")).click();
	while(true)
		{
		String 
		
	s=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
	System.out.println("Current Title is:"+s);
	if(!s.equalsIgnoreCase("September 2022"))
	{
		driver.findElement(By.xpath("//*[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();}
	else
	{	break;
	}
	}

	driver.findElement(By.xpath("//tbody//tr[2]//td[2]//*[contains(text(),'5')]")).click();
	}
	}

	