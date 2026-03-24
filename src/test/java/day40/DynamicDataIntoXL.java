package day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DynamicDataIntoXL {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
//		Step1: open xl sheet 
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\DynamicOneData.xlsx");
//		step2: create workbook
		XSSFWorkbook workbook =new XSSFWorkbook();
//		step3:create sheet 
		XSSFSheet sheet = workbook.createSheet("DynamicData");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int noOfrows = sc.nextInt();
		System.out.println("Enter the number of cells: ");
		int noOfcells = sc.nextInt();
		
		for(int r=0;r<noOfrows;r++) {
			XSSFRow currentrow = sheet.createRow(r);
			for(int c=0;c<noOfcells;c++) {
				
				XSSFCell cell = currentrow.createCell(c);
				cell.setCellValue(sc.next());
				
			}
		}
		workbook.write(file);
		workbook.close();
		file.close();

	}

}
