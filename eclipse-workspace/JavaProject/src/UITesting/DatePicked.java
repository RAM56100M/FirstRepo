package UITesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicked {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	//WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	
driver.get("https://jqueryui.com/resources/demos/datepicker/other-months.html");
driver.findElement(By.id("datepicker")).click();
String s=driver.findElement(By.xpath("//*[@class=\"ui-datepicker-title\"]")).getText();
System.out.println(s);
while(true) {
	
	if(!s.equalsIgnoreCase("September 2022")) {
		driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-e'][contains(text(),'Next')]")).click();}
	else {
		break;}
	int date=5;
	driver.findElement(By.xpath("//*[@class='ui-datepicker-calendar']//tbody//tr//td//a[text()='"+ date+"']")).click();
	
	}
}

}
