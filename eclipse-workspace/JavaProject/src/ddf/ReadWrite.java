package ddf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadWrite {
  public  String ReadData(int row, int cell) throws IOException {
	   File file=new File("C:\\Users\\RAM V. MARSHIVANE\\eclipse-workspace\\JavaProject\\New Microsoft Excel Worksheet.xlsx");
	   FileInputStream fis=new FileInputStream(file);
	   XSSFWorkbook wb=new XSSFWorkbook(fis);
	   XSSFSheet sheet=wb.getSheetAt(0);
	   String 
	   s=sheet.getRow(row).getCell(cell).getStringCellValue();
	   return s;
	   }
  
	   public static void main(String[] args) throws IOException {
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
			ReadWrite d= new ReadWrite();
			driver.findElement(By.id("email")).sendKeys(d.ReadData(1,0));
			driver.findElement(By.id("pass")).sendKeys(d.ReadData(1,1));
			driver.findElement(By.id("loginbutton")).click();
			String ErrorMsg=driver.findElement(By.xpath("//div[@id=\"email_container\"]/div[2]")).getText();
			System.out.println(ErrorMsg);
	   
 
  }
}
