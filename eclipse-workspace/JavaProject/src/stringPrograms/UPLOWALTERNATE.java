package stringPrograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UPLOWALTERNATE {
	static WebDriver driver;
public static void main(String[] args) throws IOException {
	
	TakesScreenshot tcs= (TakesScreenshot) driver;
	File Sourcefile=tcs.getScreenshotAs(OutputType.FILE);
	File DectFile = new File("Path of screenshot folder");
	FileUtils.copyFile(Sourcefile, DectFile);
}
}
