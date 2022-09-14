package LibraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass
{
	
	//this method is use get test data from excel sheet
	//need to pass 2 parameters 1. rowIndex, 2. cellIndex
	public static String getTD(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\PratikZip\\July21B_Selenium_Maven\\TestData\\July21B.xlsx");
		 Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		 String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;
	}
	
	
	
	//this method is use to capture Screenshot of webpage
	//need to pass 2 parameters 1. WebDriver, 2. TestCaseID
	public static void captureScreenshot(WebDriver d,int TestCaseID) throws IOException
	{
		File src = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\PratikZip\\July21B_Selenium_Maven\\Screenshots\\TestCase"+TestCaseID+ ".jpg");		
		FileHandler.copy(src, dest);		
		
		
	}
	
	
	
	public static String getDataFromPF(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\PratikZip\\July21B_Selenium_Maven\\PropertyFile.properties");
		Properties obj=new Properties();
		obj.load(file);
		
		String value = obj.getProperty(key);
		return value;
	}
	

}
