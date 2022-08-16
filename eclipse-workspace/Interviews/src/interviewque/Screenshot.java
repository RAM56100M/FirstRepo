package interviewque;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) {
		System.setProperty("driver", "path");
		WebDriver driver= new ChromeDriver();
		TakesScreenshot tcs= (TakesScreenshot) driver;
		File ScrFile=tcs.getScreenshotAs(OutputType.FILE);
		File destfile= new File(".\\Screenshot\\img.png");
		//fileUtils.copyFile(ScrFile,destfile);
	}
}
