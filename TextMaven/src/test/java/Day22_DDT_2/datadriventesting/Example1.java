package Day22_DDT_2.datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Example1 {
	/**
	 * 1. Get sheet count 2. All sheet name 3. Add new sheet 4. Delete existing
	 * sheet
	 * 
	 * @throws IOException
	 */
	@Test(enabled=false)
	public void Sheet_operation() throws IOException {

		/* Identify the path and name of excel file */
		FileInputStream Read_file = new FileInputStream(".\\src\\test\\resources\\AppData\\AppTestData.xlsx");
		// Create object of XSSFWorkbook
		Workbook workbook = new XSSFWorkbook(Read_file);
		// Get the number of sheet
		int no_of_sheet_in_workbook = workbook.getNumberOfSheets();
		System.out.println("no_of_sheet_in_workbook :" + no_of_sheet_in_workbook);
		// get all sheet name
		for (int i = 0; i < no_of_sheet_in_workbook; i++) {
			System.out.println("Sheet name is  : " + i + "  " + workbook.getSheetName(i));
		}
		// create new sheet in work book
		workbook.createSheet("TEST Sheet");
		// delete sheet1 from excel workbook
		workbook.removeSheetAt(3);
		// create instance of FilOutputStream
		FileOutputStream Write_file = new FileOutputStream(".\\src\\test\\resources\\AppData\\AppTestData.xlsx");
		// write or store the content into required file
		workbook.write(Write_file);
		Write_file.flush();
		Write_file.close();

	
	}
	/**
	 * 1. get row count 2. create new row 3. delete row
	 */
	@Test(enabled=false)
	public void Row_operation() throws IOException {

		/* Identify the path and name of excel file */
		FileInputStream Read_file = new FileInputStream(".\\src\\test\\resources\\AppData\\AppTestData.xlsx");
		// Create object of XSSFWorkbook
		Workbook workbook = new XSSFWorkbook(Read_file);
		// get specific sheet from excel workbook
		Sheet sheet = workbook.getSheet("sheet1");
		//count the row in a particular sheet
		int row_count=sheet.getLastRowNum();
		System.out.println("Row count is :"+  row_count);
		sheet.createRow(row_count+1);
		Row row = sheet.getRow(row_count);
		sheet.removeRow(row);
		sheet.createRow(row_count+1);
	
//		create instance of FilOutputStream
		FileOutputStream Write_file = new FileOutputStream(".\\src\\test\\resources\\AppData\\AppTestData.xlsx");
//		write or store the content into required file
		workbook.write(Write_file);
		Write_file.flush();
		Write_file.close();

	}
	@Test
	public void Cell_operation() throws IOException {

		/* Identify the path and name of excel file */
		FileInputStream Read_file = new FileInputStream(".\\src\\test\\resources\\AppData\\AppTestData.xlsx");
		// Create object of XSSFWorkbook
		Workbook workbook = new XSSFWorkbook(Read_file);
		// get specific sheet from excel workbook
		Sheet sheet = workbook.getSheet("sheet1");
		//get cell of specific sheet
		Row row = sheet.getRow(2);
		//get count of cell
		int cell_count = row.getLastCellNum();
		System.out.println("cell count :"+cell_count);
		/*read cell contents*/
		for (int i = 0; i < cell_count; i++) {

			try {
				/* switch to check cell type and read the content accordingly */
				switch (row.getCell(i).getCellType()) {

				case Cell.CELL_TYPE_STRING:
					System.out.println("Cell contents are :" + row.getCell(i).getStringCellValue());
					break;
				case Cell.CELL_TYPE_NUMERIC:
					System.out.println("Cell contents are :" + (int) row.getCell(i).getNumericCellValue());
					break;

				case Cell.CELL_TYPE_BLANK:

					break;
				default:
					System.out.println("No matching cell found");
					break;
				}
			} catch (NullPointerException e) {
				System.out.println("Cell contents are :");
			}

		}
	}
	@Test
	public void getDiffTypeOfCellData() throws IOException {
		// Create instance of FileInputStream class and pass the required excel file location to its constructor
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\AppData\\AppTestData.xlsx");
		// create an instance of required workbook class and pass FileInputStream instance to its constructor
		Workbook workbook = new XSSFWorkbook(fis);
		// get the required sheet from excel
		Sheet sheet = workbook.getSheet("Sheet1");
		// get specific row from the sheet
		Row row=sheet.getRow(3);
		//get the cell count from the Row
		int cellCount=row.getLastCellNum();
		System.out.println("Cell count on row3 : "+cellCount);
		//get all cell data from row3
		for(int i=0;i<cellCount;i++) {
			//System.out.println("Cell data: "+row.getCell(i).getStringCellValue());
			
			Cell cell=row.getCell(i);
			switch(cell.getCellType()) {
			
				case(Cell.CELL_TYPE_STRING): 
					System.out.println("Cell Data: "+cell.getStringCellValue());
					break;
				case(Cell.CELL_TYPE_NUMERIC): 
					System.out.println("Cell Data: "+cell.getNumericCellValue());
					break;
				case(Cell.CELL_TYPE_BOOLEAN): 
					System.out.println("Cell Data: "+cell.getBooleanCellValue());
					break;
				default:
					System.out.println("Invalid cell details");
					break;
			}				
		}
}
}
