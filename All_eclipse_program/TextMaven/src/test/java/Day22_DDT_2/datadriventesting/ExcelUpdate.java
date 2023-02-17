package Day22_DDT_2.datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelUpdate {

	@Test
	public void updateCellDetails() throws IOException {
		// Create instance of FileInputStream class and pass the required excel file location to its constructor
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\AppData\\AppTestData.xlsx");
		// create an instance of required workbook class and pass FileInputStream instance to its constructor
		Workbook workbook = new XSSFWorkbook(fis);
		// get the required sheet from excel
		Sheet sheet = workbook.getSheet("Sheet1");
		// get specific row from the sheet
		Row row=sheet.getRow(1);
		//create cell to update the data
		Cell cell=row.createCell(3);
		cell.setCellValue("Passed");
		
		//to store the update data find the location to save the file
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\AppData\\AppTestData.xlsx");
		//write the content in to the required file
		workbook.write(fos);
		//close the connection
		fos.close();		
		System.out.println("File Updated...");
	}
	
	@Test
	public void updateSheetDetails() throws IOException {
		// Create instance of FileInputStream class and pass the required excel file location to its constructor
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\AppData\\AppTestData.xlsx");
		// create an instance of required workbook class and pass FileInputStream instance to its constructor
		Workbook workbook = new XSSFWorkbook(fis);
		//TODO: create new sheet
		workbook.createSheet("Testing_sheet");
		//TODO: create multiple rows(3)
		Sheet sheet = workbook.getSheet("Testing_sheet");
		Sheet sheet1 = workbook.getSheet("Sheet1");
		for (int a=0;a<4;a++) {
			Row row=sheet.createRow(a);
			//get data from sheet 1
			
			Row row1 = sheet1.getRow(a);
				
			for (int j=0;j<4;j++){
				Cell create_cell=row.createCell(j);
					try {
					Cell cell=row1.getCell(j);
					System.out.println(cell);
					switch(cell.getCellType()) {
					
						case(Cell.CELL_TYPE_STRING): 
							create_cell.setCellValue(cell.getStringCellValue());
							break;
						case(Cell.CELL_TYPE_NUMERIC): 
							create_cell.setCellValue(cell.getNumericCellValue());
							break;
						case(Cell.CELL_TYPE_BOOLEAN): 
							create_cell.setCellValue(cell.getBooleanCellValue());
							break;
						default:
							System.out.println("Invalid cell details");
							break;
					}}catch(Exception e) {
						
					}}
		}

		
		//TODO: create 3 cell in each row
		//TODO: add different type of values
		
		//to store the update data find the location to save the file
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\AppData\\AppTestData.xlsx");
		//write the content in to the required file
		workbook.write(fos);
		//close the connection
		fos.close();		
		System.out.println("File Updated...");
	}
}
