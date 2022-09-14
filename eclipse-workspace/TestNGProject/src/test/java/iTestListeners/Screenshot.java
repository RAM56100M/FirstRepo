package iTestListeners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenshot {
	public void captureScreen(WebDriver driver, String Name) throws IOException {
		
 TakesScreenshot ts=(TakesScreenshot) driver;
 File src=ts.getScreenshotAs(OutputType.FILE);
 //File dest= new File (System.getProperty("user.dir")+"//Screenshot//"+Name+".png");
 File dest= new File("C:\\Users\\RAM V. MARSHIVANE\\eclipse-workspace\\TestNGProject\\Screenshot\\fail.png");
 FileHandler.copy(src, dest);
 System.out.println("Screenshot Captured");
  }
}
