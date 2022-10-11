package DataFatchFromExcelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetMethodChainingUse 
{
	public static void main(String[] args) throws IOException     
	{
		String path="C:\\Excel Sheet file\\S1.xlsx";
		
		FileInputStream file=new FileInputStream(path);
		
		XSSFWorkbook wb=new XSSFWorkbook(file);

		String username= wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
        System.out.println(username);
       
		String password= wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
        System.out.println(password);
        
        double number=wb.getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
        int result=(int)number;
        System.out.println(result);
	}

}
