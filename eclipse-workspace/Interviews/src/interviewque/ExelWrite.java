package interviewque;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.batik.apps.rasterizer.Main;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExelWrite {
	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\chrome103\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/automation-practice-form");
	WebElement FN=driver.findElement(By.id("firstName"));
	WebElement LN =driver.findElement(By.id("lastName"));
	WebElement EMAIL=driver.findElement(By.xpath("//input[@placeholder=\"name@example.com\"]"));
	WebElement GENDER=driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
	WebElement Mobile=driver.findElement(By.id("userNumber"));
	WebElement Address=driver.findElement(By.id("currentAddress"));
	WebElement Submitbtn=driver.findElement(By.xpath("//button[@id=\"submit\"]"));
	File file =    new File("C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\New Microsoft Excel Worksheet.xlsx");
	

    //Create an object of FileInputStream class to read excel file
    FileInputStream inputStream = new FileInputStream(file);
	
    XSSFWorkbook wb=new XSSFWorkbook(inputStream);
    XSSFSheet sheet=wb.getSheet("RamData");
    
    //get all rows in the sheet
    int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
  //iterate over all the rows in Excel and put data in the form.
    for(int i=1;i<=rowCount;i++) {
        //Enter the values read from Excel in firstname,lastname,mobile,email,address
        FN.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
        LN.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
        EMAIL.sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());
        Mobile.sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());
        Address.sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());
        
        //Click on the gender radio button using javascript
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", GENDER);
        
        //Click on submit button
        Submitbtn.click();
        
        //Verify the confirmation message
        WebElement confirmationMessage = driver.findElement(By.xpath("//div[text()='Thanks for submitting the form']"));
        
        //create a new cell in the row at index 6
        XSSFCell cell = sheet.getRow(i).createCell(6);
        
        //check if confirmation message is displayed
        if (confirmationMessage.isDisplayed()) {
            // if the message is displayed , write PASS in the excel sheet
            cell.setCellValue("PASS");
            
        } else {
            //if the message is not displayed , write FAIL in the excel sheet
            cell.setCellValue("FAIL");
        }
        
        // Write the data back in the Excel file
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\RAM V. MARSHIVANE\\OneDrive\\Desktop\\New Microsoft Excel Worksheet.xlsx");
        wb.write(outputStream);

        //close the confirmation popup
        WebElement closebtn = driver.findElement(By.id("closeLargeModal"));
        closebtn.click();
        
        //wait for page to come back to registration page after close button is clicked
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
    }
    
    //Close the workbook
    wb.close();
    
    //Quit the driver
    driver.quit();
    }
	}

