package day40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel File  --> Workbook --> sheet---> row--->  cell
public class WriteDataIntoExcel 
{
	public static void main(String[] args) throws IOException 
	{
	
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\02_data_emptyfile.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Data1"); //sheetname as Data1
		
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("Harish");
		row1.createCell(1).setCellValue("Sapna");
		row1.createCell(2).setCellValue("Saanvi");
		row1.createCell(3).setCellValue("Shlok");
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("Male");
		row2.createCell(1).setCellValue("Female");
		row2.createCell(2).setCellValue("Female");
		row2.createCell(3).setCellValue("Male");
		
		XSSFRow row3 = sheet.createRow(2);
		row3.createCell(0).setCellValue("34");
		row3.createCell(1).setCellValue("33");
		row3.createCell(2).setCellValue("01");
		row3.createCell(3).setCellValue("01");
		
		workbook.write(file);    // connection between file and workbook
		workbook.close();
		file.close();
		System.out.println("New Sheet is created in the file");
		
	}

}
