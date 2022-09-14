package stringPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
public static void main(String[] args) throws IOException {
	File file= new File("C:\\Users\\RAM V. MARSHIVANE\\Downloads\\New Microsoft Excel Worksheet.xlsx");
	FileInputStream fis= new FileInputStream(file);
	XSSFWorkbook wb= new XSSFWorkbook(fis);
	XSSFSheet sheet= wb.getSheetAt(0);
	System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
	int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
	int cellcount=sheet.getRow(1).getLastCellNum();
    for(int i=0;i<=rowCount;i++){
        for(int j=0;j<cellcount;j++){
            System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() +",");

}            System.out.println();

}}}
