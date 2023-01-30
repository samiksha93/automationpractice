package Testscript_actitime;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Webpages_actitime.ActiTimeTaskAddPage;
import Webpages_actitime.ActiTimeHomePage;
import Webpages_actitime.ActiTimeLoginPage;
import utilities.SeleniumUtility;



public class TestActiTime extends SeleniumUtility {
	ActiTimeLoginPage getActiTimeLoginPage;
	ActiTimeHomePage getActiTimeHomePage;
	ActiTimeTaskAddPage getActiTimeTaskAddPage;
	
	
	@BeforeTest
	public void stratup() {
		WebDriver driver=setUp("chrome","https://demo.actitime.com/login.do");
		getActiTimeLoginPage =new ActiTimeLoginPage(driver);
		getActiTimeHomePage= new ActiTimeHomePage(driver);
		getActiTimeTaskAddPage=new ActiTimeTaskAddPage(driver);

	}
	
	@Test(priority=1)
	public void testActiTimeLoginFeature() {
		getActiTimeLoginPage.LoginInActTime("admin", "manager");
		
		}
	
	@Test(priority=2,dependsOnMethods ="testActiTimeLoginFeature")
	public void testActiTimeHomePageFeature() {
		getActiTimeHomePage.tasksHomePageMethod();
		
		}
	@Test(priority=3,dependsOnMethods ="testActiTimeHomePageFeature")
	public void testActiTimeTaskCreation() {
		getActiTimeTaskAddPage.taskCreateMethod("Task2");
		
		}
	@Test(priority=3,dependsOnMethods ="testActiTimeTaskCreation")
	public void testActiTimeTaskDeletion() {
		getActiTimeHomePage.deleteTaskMethod();
		
		}
}

