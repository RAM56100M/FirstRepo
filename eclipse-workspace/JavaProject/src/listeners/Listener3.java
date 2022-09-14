package listeners;
import java.io.File;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Listener3 extends Listener2 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("On Test Start from Listener");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("On Test Success from Listener");
		TakeScreenshot(driver, result.getTestName());
	}

	public static void TakeScreenshot(WebDriver driver, String name) {
		TakesScreenshot screen = (TakesScreenshot) driver;
		File Source = screen.getScreenshotAs(OutputType.FILE);

		int no = 1;
//File Destination=new 
		
		File Destination = new File(
				"C:\\Users\\RAM V. MARSHIVANE\\eclipse-workspace\\JavaProject\\Screenshots\\abc.png");
		no++;
		try {
			FileHandler.copy(Source, Destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("ScreenShot is taken");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("On Test Fail from Listener");
		TakeScreenshot(driver, result.getTestName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("on Test Skip from Listener");
	}
}
