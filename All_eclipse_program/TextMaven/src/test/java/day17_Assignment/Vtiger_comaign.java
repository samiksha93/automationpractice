package day17_Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilities.SeleniumUtility;

public class Vtiger_comaign extends SeleniumUtility{

		WebDriver driver;
		@BeforeTest()
		  public void open_url() {
			driver = setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		}
		@Test(priority=1)
		public void signin() {
			//click on signin
			findElementby_xpath("//button[text()=\"Sign in\"]").click();
			
		}
		@Parameters({"sub_menu","index"})
		@Test(priority=2  )
		public void menu(String sub_menu, int index) {
			//click on main menu button
			findElementby_xpath("//div[@id=\"appnavigator\"]/div/span").click();
			
			//click on sales menu
			findElementsby_cssSelector(".menu-items-wrapper.app-menu-items-wrapper",1);
			//click on Services option
			findElementby_xpath("//span[text()=\" Services\"]").click();
			}
		
		@Test(priority=3)
		public void add_services() {
			//click on Add services button
			
			findElementby_xpath("//button[contains(text(),\"Add Service\")]").click();
			//identify subject field
			findElementby_cssSelector("#Services_editView_fieldName_servicename").sendKeys("new2Service_test",Keys.TAB);
			//click on save button

			findElementby_xpath("//button[text()='Save']").click();
			WebDriverWait wait= new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
			System.out.println("Add service suceesfully");
		}
		
	
		
		@Test(priority=4)
		public void edit_services() throws InterruptedException  {
			
			findElementby_xpath("//h4[contains(text(),'Services')]").click();
	
			//search contact by enter service name
			findElementby_xpath("//input[@name='servicename']").sendKeys("new2Service_test");
			//click on search button			
			findElementby_xpath("//span[contains(text(),'Search')]").click();
			//click on check box
			for(int i=0; i<=5;i++){
				try{
					findElementby_xpath("//tr[td[span[span[a[text()='new2Service_test']]]]]/td[1]/div/span[1]/input").click();
				 break;
				 }
				 catch(Exception e){}
				}			
				//click on edit button
			
				findElementby_cssSelector("#Services_listView_massAction_LBL_EDIT").click();
				
				//update service name
				findElementby_cssSelector("#Services_editView_fieldName_servicename").sendKeys("Service_test111");
			
				//update servicewebsite type
				findElementby_cssSelector("#Services_editView_fieldName_website").sendKeys("Automation");
				Thread.sleep(5000);
//				//click on save button
//				WebDriverWait wait1= new WebDriverWait(driver,30);
//				wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
				findElementby_xpath("//button[text()='Save']").click();
				Thread.sleep(5000);
			
				
				try {
				findElementby_xpath("//button[contains(text(),'Clear')]").click();
				}catch(Exception e){}
				System.out.println("Edit service suceesfully");
		}
		@Test(priority=4)
		public void Delete_service()  {
			
//			click on check box
			for(int i=0; i<=5;i++){try {
			findElementby_xpath("//tr[td[span[span[a[text()='Service_test111']]]]]/td[1]/div/span[1]/input").click();
			}catch(Exception e) {}}
//			findElementby_cssSelector(".listViewEntriesCheckBox").click();
			findElementby_cssSelector("#Services_listView_massAction_LBL_DELETE").click();
			driver.switchTo().alert().accept();
			System.out.println("Edit service suceesfully");
		}	
  
}
