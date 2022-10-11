package DataFatchFromExcelsheet;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataSendToTheExcelSheet 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		String path="C:\\Excel Sheet file\\S1.xlsx";
		
		FileOutputStream file= new FileOutputStream(path);
		
		XSSFWorkbook wb=new XSSFWorkbook();
		
		XSSFSheet st=wb.getSheet("sheet3");
		
		XSSFRow rw=st.getRow(0);
		
		XSSFCell cl=rw.getCell(0);
		
		String value=cl.getStringCellValue();
		
		
	}
	

}
