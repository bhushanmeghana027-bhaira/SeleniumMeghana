package day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromXL {

	public static void main(String[] args) throws IOException {
		
//		always remember this flow excel-->workbook->sheet--->Rows--->cell
		// TODO Auto-generated method stub
//		step1.get the file
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
//		step2.coonect to sheet 
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int totalRows = sheet.getLastRowNum();
		int totalCells = sheet.getRow(1).getLastCellNum();
		System.out.println(" no of rows:"+totalRows);
		System.out.println(" no of cells:"+totalCells);
//		step4.get rows
		for(int r=0;r<=totalRows;r++) {
			XSSFRow currentRow = sheet.getRow(r); //get the row
			for(int c=0;c<totalCells;c++) {
				XSSFCell cell = currentRow.getCell(c);
				System.out.print(cell.toString()+'\t');
				
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
		
	}

}
