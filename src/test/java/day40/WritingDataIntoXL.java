package day40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoXL {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		Step1: open xl sheet 
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
//		step2: create workbook
		XSSFWorkbook workbook =new XSSFWorkbook();
//		step3:create sheet 
		XSSFSheet sheet = workbook.createSheet("Data");
//		create row
		XSSFRow row1 = sheet.createRow(0);
//		create cell and update value
		row1.createCell(0).setCellValue("Java");
		row1.createCell(1).setCellValue(1234);
		row1.createCell(2).setCellValue("Automation");
		
		
		XSSFRow row2 = sheet.createRow(1);
//		create cell and update value
		row2.createCell(0).setCellValue("Python");
		row2.createCell(1).setCellValue(3);
		row2.createCell(2).setCellValue("Automation");
		
		XSSFRow row3 = sheet.createRow(2);
//		create cell and update value
		row3.createCell(0).setCellValue("C#");
		row3.createCell(1).setCellValue(5);
		row3.createCell(2).setCellValue("Automation");
//		step4 attach workbook to file
		workbook.write(file);
		workbook.close();
		file.close();
		
		
		

	}

}
