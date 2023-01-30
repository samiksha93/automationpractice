package TestScripts_OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import WebPages_OrangeHRM.OrangeHRM_Home_Page;
import WebPages_OrangeHRM.OrangeHRM_PIM_Add_Page;
import WebPages_OrangeHRM.OrangeHRM_PIM_Edit_Page;
import WebPages_OrangeHRM.OrangeHRM_PIM_Home_page;
import WebPages_OrangeHRM.OrangeHRM_login_Page;
import utilities.SeleniumUtility;

public class OrangeHRM extends SeleniumUtility {
	OrangeHRM_login_Page getOrangeHRM_login_Page;
	OrangeHRM_Home_Page getOrangeHRM_Home_Page;
	OrangeHRM_PIM_Add_Page getOrangeHRM_PIM_Add_Page;
	OrangeHRM_PIM_Home_page getOrangeHRM_PIM_Home_Page;
	OrangeHRM_PIM_Edit_Page getOrangeHRM_PIM_Edit_Page;

	@BeforeTest
	public void startUp() {
		WebDriver driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/");
		getOrangeHRM_login_Page = new OrangeHRM_login_Page(driver);
		getOrangeHRM_Home_Page = new OrangeHRM_Home_Page(driver);
		getOrangeHRM_PIM_Home_Page = new OrangeHRM_PIM_Home_page(driver);
		getOrangeHRM_PIM_Add_Page = new OrangeHRM_PIM_Add_Page(driver);
		getOrangeHRM_PIM_Edit_Page = new OrangeHRM_PIM_Edit_Page(driver);
		
	}

	@Test
	public void testOranghrmLoginFeature() {
		getOrangeHRM_login_Page.loginInOrangeHRM("Admin", "admin123");
		System.out.println("login complete");
	}

	@Test(priority=1)
	public void testPimCreation(){

		getOrangeHRM_Home_Page.clickOnPim();
		getOrangeHRM_PIM_Home_Page.clickOnAddButton();
		getOrangeHRM_PIM_Add_Page.createEmployee("automate1", "test1", 2000);
		getOrangeHRM_Home_Page.clickOnPim();
		getOrangeHRM_PIM_Home_Page.searchCreatedEmployee(2000);

		String acutalMsg=getOrangeHRM_PIM_Home_Page.getSearchResultMsg();
		String expectedMsg="(1) Record Found";
		Assert.assertEquals(acutalMsg, expectedMsg);
		System.out.println("PimADD complete");
	}

	@Test(priority=2)
	public void testPimModification() {
		getOrangeHRM_PIM_Home_Page.editCreatedEmployee();
		getOrangeHRM_PIM_Edit_Page.editPersonalDetail();
		System.out.println("pimEdit complete");
	}

	@Test(priority=3)
	public void testPimDeletion() {
		getOrangeHRM_Home_Page.clickOnPim();
		getOrangeHRM_PIM_Home_Page.searchCreatedEmployee(2000);
		getOrangeHRM_PIM_Home_Page.deleteCreatedEmployee();
		String acutalMsg=getOrangeHRM_PIM_Home_Page.getSearchResultMsg();
		String expectedMsg="No Records Found";
		Assert.assertEquals(acutalMsg, expectedMsg);
		
		System.out.println("pimdelete complete");
	}
		@AfterTest
		public void ends() {
			cleanUp();
		}
}