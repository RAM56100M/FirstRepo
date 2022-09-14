package HARD_assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue {
	@Test
	public void AssertTrue() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		String act_title = driver.getTitle();
		boolean b = act_title.equalsIgnoreCase("Google");
		System.out.println(act_title);
		
		Assert.assertTrue(b);
		System.out.println("Method after hard assert assert true");}
		
	@Test
	public void assertfalse() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		String act_title = driver.getTitle();
		boolean b = act_title.equalsIgnoreCase("Google");
		System.out.println(act_title);
		
		Assert.assertFalse(b);
		System.out.println("Method after hard assert assert false");}

	}

