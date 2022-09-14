package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Paralllel {
	public WebDriver driver;
    @Test
    public void FirefoxTest() {	 
   	 System.setProperty("webdriver.edge.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\velocity\\selenium\\EDGETESTING.exe");
    driver = new EdgeDriver();  
    driver.get("https://www.demoqa.com"); 
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
    driver.quit();
     }

//    @Test
//	public void ChromeTest()
//	{ 
//    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
//		
//  driver = new ChromeDriver();
//  driver.get("https://www.demoqa.com"); 
//  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
//  driver.quit();
	}

