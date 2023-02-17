package Day21_DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DDT_example1 {
	  @Test
	  public void sheetOps() throws IOException {
		  
		  FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\AppData\\AppTestData.xlsx");
		 // XSSFWorkbook xworkbook=new XSSFWorkbook(fis);
		  				//or
		  Workbook workbook=new XSSFWorkbook(fis);
		  //after getting workbook you can perform any operation on Sheet
		 int sheetCt= workbook.getNumberOfSheets();
		 System.out.println("Sheet count is: "+sheetCt);
		 //print sheet names
		 for(int i=0;i<sheetCt;i++) {
//			Sheet sheet= workbook.getSheetAt(i);
//			String sheetName=sheet.getSheetName();
//			System.out.println("Sheet names: "+sheetName);
					//or
			System.out.println("Sheet names: "+workbook.getSheetAt(i).getSheetName());
		 }
		 //if you have to perform any operation on specific row dn use sheet object for that
		 Sheet sheet =workbook.getSheet("Sheet1");
	  }
	  @Test
	  public void rowOps() {
		  
	  }
	  @Test
	  public void cellOps() {
		  
	  }
	  @Test
	  public void readDiffrenetTypeOfDataFromExcel() {
		  
	  }
	}

