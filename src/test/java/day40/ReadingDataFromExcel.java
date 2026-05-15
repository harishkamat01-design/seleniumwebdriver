package day40;
//Excel File  --> Workbook --> sheet---> row--->  cell
//Aim: Reading the excel File , that means open the excel in reading mode.

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream file     = new FileInputStream(System.getProperty("user.dir")+ "\\testdata\\01_data.xlsx"); // go to path of Excel file
		XSSFWorkbook    workbook = new XSSFWorkbook(file);          // extract the workbook from excel file
		XSSFSheet       sheet    = workbook.getSheet("Sheet1");    //extract sheet from workbook
		
		int totalRows = sheet.getLastRowNum();            // we will get the total number of rows and we put that in the Integer variable. ====5
															// but it gives 4 as rows starts with 0
		int totalCells = sheet.getRow(1).getLastCellNum(); // from any one row <getRow(1)> , we will get the last cell number <getLastCellNum()>
		                                                   // which gives total number of cells in one row ====== 3 , cells start with 1,
		                                                   //but for java, index starts with 0, refer below for loop c<totalCells
	    System.out.println("No. of rows: " + totalRows);
	    System.out.println("No. of cells: " + totalCells);
	 
	    
	    for (int r=0; r<=totalRows; r++)
	    {
	    	   XSSFRow currentRow = sheet.getRow(r);          // gives current row as 0, 1, 2 ,3 as the for loop of row increments
	    	
	    	for (int c=0; c<totalCells; c++)                //for java , always index starts with 0, so c<totalCells ,  
	    	{
	    		XSSFCell cell=currentRow.getCell(c);        // gives the current cell (0,0) and as cell increments (0,1) and (0,2)
	    	    cell.toString();                            //Actual cell value ex:Harish, Saanvi
	    	    System.out.print(cell.toString()+ "\t");
	    	}
	    System.out.println();
	    	
	    }
	    workbook.close();
	    file.close();
	}

}
