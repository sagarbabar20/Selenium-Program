package DataFatchFromExcelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultipleDataFetchFromExcel 
{
public static void main(String[] args) throws IOException
{
	String path="C:\\Excel Sheet file\\S1.xlsx";
	
	FileInputStream file= new FileInputStream(path);
	
	XSSFWorkbook wb=new XSSFWorkbook(file);
	
	XSSFSheet sht=wb.getSheet("Sheet2");
	
	for(int i=0; i<=5; i++)
	{
		for(int j=0; j<=1; j++)
		{
			XSSFRow rw=sht.getRow(i);
			XSSFCell cl=rw.getCell(j);
			String result=cl.getStringCellValue();
			System.out.println(result);
		}
	}
	
}
}
