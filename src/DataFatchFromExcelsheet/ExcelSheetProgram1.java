package DataFatchFromExcelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetProgram1
{
	public static void main(String[] args) throws IOException 
	{
		String path="C:\\Excel Sheet file\\S1.xlsx";
		
		//file open-read
		FileInputStream file=new FileInputStream(path);
		
		//Workbook-read
		XSSFWorkbook wb=new XSSFWorkbook(file);
		
		//Sheet-read
		XSSFSheet sht= wb.getSheet("Sheet1");
		
		//Row Read
		XSSFRow rw = sht.getRow(0);

		//cell read
		XSSFCell cl=rw.getCell(0);

		//Data read
		String result=cl.getStringCellValue();
		
		System.out.println(result);
		
		//password
		XSSFRow rw1 = sht.getRow(1);

		XSSFCell cl1=rw1.getCell(0);

		String result1=cl1.getStringCellValue();
		
		System.out.println(result1);

		
	}

}
