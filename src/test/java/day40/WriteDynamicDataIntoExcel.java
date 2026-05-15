package day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel File  --> Workbook --> sheet---> row--->  cell
public class WriteDynamicDataIntoExcel 
{
	public static void main(String[] args) throws IOException 
	{
	
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\03_DynamicData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Dynamic_Data"); //sheetname
		
		Scanner sc = new Scanner(System.in);    //Scanner class is used for providing the data dynamically at runtime by user.

		
		System.out.println("How many rows");
		int noOfRows = sc.nextInt();                                 // nextInt() = integer value
		
		System.out.println("How many cells");
		int noOfCells = sc.nextInt();                               // nextInt() = integer value
		
		for(int r=0;r<=noOfRows; r++ )
		{
			XSSFRow currentRow =sheet.createRow(r);                   //create and gives the current row
			
			  for(int c=0;c<noOfCells; c++)
			  {
			   XSSFCell  cell = currentRow.createCell(c);	        //create and gives the current cell
			   cell.setCellValue(sc.next());                       //set the value to the cell
			 }
		}
		
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("New is created");
		
	}

}
