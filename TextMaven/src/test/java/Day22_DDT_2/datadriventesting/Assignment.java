package Day22_DDT_2.datadriventesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtility;

public class Assignment extends SeleniumUtility {

	String appUrl;
	String userName;
	String password;
	String Expacted_result;
	String Actual_result;

	//Vtiger login
	@Test(priority=0)
	public void getData() {
		appUrl = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 1, 0);
		userName = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 1, 1);
		password = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 1, 2);
		Expacted_result = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 1, 3);
		}
	@Test(priority=1)
	public void VtigerLogin() {
		WebDriver driver = setUp("chrome", appUrl);
		typeInput(driver.findElement(By.id("username")), userName);
		typeInput(driver.findElement(By.name("password")), password);
		performClick(driver.findElement(By.xpath("//button[text()=\"Sign in\"]")));
		ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 1, 4,
				getPageTitle());
		Actual_result = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 1, 4);
		if (Expacted_result.equals(Actual_result)) {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 1, 5, "Passed");
		} else {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 1, 5, "Failed");
		}
		Assert.assertEquals(Expacted_result, Actual_result);
	}
	@Test(priority=2)
	public void cleanUp1() {
		cleanUp();
	}
	
	//vtiger2 website login
	@Test(priority=3)
	public void getData1() {
		appUrl = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 2, 0);
		userName = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 2, 1);
		password = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 2, 2);
		Expacted_result = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 2, 3);
		}
	@Test(priority=4)
	public void VtigerLogin1() {
		WebDriver driver = setUp("chrome", appUrl);
		typeInput(driver.findElement(By.id("username")), userName);
		typeInput(driver.findElement(By.name("password")), password);
		performClick(driver.findElement(By.xpath("//button[text()=\"Sign in\"]")));
		ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 2, 4,
				getPageTitle());
		Actual_result = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 2, 4);
		if (Expacted_result.equals(Actual_result)) {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 2, 5, "Passed");
		} else {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 2, 5, "Failed");
		}
		Assert.assertEquals(Expacted_result, Actual_result);
	}
	@Test(priority=5)
	public void cleanUp2() {
		cleanUp();
	}
	
	//ActiTime login
	@Test(priority=6)
	public void getData2() {
		appUrl = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 3, 0);
		userName = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 3, 1);
		password = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 3, 2);
		Expacted_result = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 3, 3);
	}
	@Test(priority=7)
	public void Acti_time() {
		WebDriver driver = setUp("chrome", appUrl);
		typeInput(driver.findElement(By.name("username")), userName);
		typeInput(driver.findElement(By.name("pwd")), password);
		performClick(driver.findElement(By.id("loginButton")));
		ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 3, 4,
				getPageTitle());
		Actual_result = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 3, 4);
		if (Expacted_result.equals(Actual_result)) {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC",3, 5, "Passed");
		} else {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 3, 5, "Failed");
		}
		Assert.assertEquals(Expacted_result, Actual_result);
	}
	@Test(priority=8)
	public void cleanUp3() {
		cleanUp();
	}
	
	//Actitime login
	@Test(priority=9)
	public void getData3() {
		appUrl = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 4, 0);
		userName = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 4, 1);
		password = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 4, 2);
		Expacted_result = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 4, 3);
	}
	@Test(priority=10)
	public void Acti_time1() {
		WebDriver driver = setUp("chrome", appUrl);
		typeInput(driver.findElement(By.name("username")), userName);
		typeInput(driver.findElement(By.name("pwd")), password);
		performClick(driver.findElement(By.id("loginButton")));
		ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 4, 4,
				getPageTitle());
		Actual_result = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 4, 4);
		if (Expacted_result.equals(Actual_result)) {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC",4, 5, "Passed");
		} else {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 4, 5, "Failed");
		}
		Assert.assertEquals(Expacted_result, Actual_result);
	}
	@Test(priority=11)
	public void cleanUp4() {
		cleanUp();
	}
	
	
//	
//	// OrnageHRM Website login 
//	@Test(priority=12)
//	public void getData4() {
//		appUrl = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 5, 0);
//		userName = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 5, 1);
//		password = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 5, 2);
//		Expacted_result = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 5, 3);
//	}
//	@Test(priority=13)
//	public void OrangeHRM() {
//		WebDriver driver = setUp("chrome", appUrl);
//		typeInput(driver.findElement(By.name("username")), userName);
//		typeInput(driver.findElement(By.name("password")), password);
//		performClick(driver.findElement(By.xpath("//button[text()=\" Login \"]")));
//		ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 5, 4,
//				getPageTitle1());
//		Actual_result = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 5, 4);
//		if (Expacted_result.equals(Actual_result)) {
//			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC",5, 5, "Passed");
//		} else {
//			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 5, 5, "Failed");
//		}
//		Assert.assertEquals(Expacted_result, Actual_result);
//	}
//	@Test(priority=14)
//	public void cleanUp5() {
//		tearDown();
//	}
	// OrnageHRM2 Website login 
//		@Test(priority=12)
//		public void getData5() {
//			appUrl = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 6, 0);
//			userName = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 6, 1);
//			password = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 6, 2);
//			Expacted_result = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC",6, 3);
//		}
//		@Test(priority=13)
//		public void OrangeHRM1() {
//			WebDriver driver = setUp("chrome", appUrl);
//			typeInput(driver.findElement(By.name("username")), userName);
//			typeInput(driver.findElement(By.name("password")), password);
//			performClick(driver.findElement(By.xpath("//button[text()=\" Login \"]")));
//			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 6, 4,
//					getPageTitle1());
//			Actual_result = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 6, 4);
//			if (Expacted_result.equals(Actual_result)) {
//				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC",6, 5, "Passed");
//			} else {
//				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "TC", 6, 5, "Failed");
//			}
//			Assert.assertEquals(Expacted_result, Actual_result);
//		}
//		@Test(priority=14)
//		public void cleanUp() {
//			tearDown();
//		}
	
}