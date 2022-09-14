package ddf;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExcelRead {
	@Test
  public static String readdata(int row, int cell) throws
  InterruptedException, InvalidFormatException, IOException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
   
   driver.manage().window().maximize();
   File file=new File("C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\New Microsoft Excel Worksheet.xlsx");
   boolean y=file.canRead();
   System.out.println(y);
   FileInputStream fis= new FileInputStream (file);
   XSSFWorkbook wb= new XSSFWorkbook(fis);
   XSSFSheet sheet=wb.getSheetAt(0);
  String s= sheet.getRow(1).getCell(2).getStringCellValue();
  return s;
	}
	public static void main(String[] args) throws InvalidFormatException, InterruptedException, IOException {
		System.out.println(readdata(1,2));
		System.out.println(readdata(1,1));

	}
	
	}
	