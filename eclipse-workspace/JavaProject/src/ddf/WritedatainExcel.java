package ddf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WritedatainExcel {
  @Test
 public static void ExcelWrite(int row, int cell, String value) throws IOException {
	  File file= new File("C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\New Microsoft Excel Worksheet.xlsx");
	  FileInputStream fis= new FileInputStream(file);
	  XSSFWorkbook wb= new XSSFWorkbook(fis);
	  XSSFSheet sheet=wb.getSheetAt(0);
	  sheet.createRow(0).createCell(0).setCellValue(value);
	  FileOutputStream fos= new FileOutputStream(file);
  }
  public static void main(String[] args) throws IOException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		String title=driver.getTitle();
		 System.out.println(title);
		 ExcelWrite(0,0,title);
}
	
  }

