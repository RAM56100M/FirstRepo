package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginPage {
	private WebElement username;
	private WebElement password;
	private WebElement button1;
	public LoginPage(WebDriver driver)
	 {
	 username=driver.findElement(By.id("txtUsername"));
	 password=driver.findElement(By.id("txtPassword"));
	 button1=driver.findElement(By.id("btnLogin"));
	 
	 }
	 
	 public void Login()
	 {
	 username.sendKeys("Admin");
	 password.sendKeys("admin123");
	 button1.click();
	 
	 }

}
