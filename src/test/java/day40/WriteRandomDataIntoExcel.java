package day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel File  --> Workbook --> sheet---> row--->  cell
public class WriteRandomDataIntoExcel 
{
	public static void main(String[] args) throws IOException 
	{
	
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\04_RandomData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Random_Data"); //sheetname
		
		XSSFRow row = sheet.createRow(3);  // in excel index starts from 0
		XSSFCell cell = row.createCell(3); // in excel index starts from 0
		cell.setCellValue("Harish (3,3)");
		
		
		
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("New is created");
		
	}

}
