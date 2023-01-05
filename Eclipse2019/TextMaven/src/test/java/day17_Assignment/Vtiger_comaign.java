package day17_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Vtiger_comaign extends SeleniumUtility{

		WebDriver driver;
		@BeforeClass
		  public void compagaign() {
			driver = setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		}
		@Test(priority=1)
		public void signin() {
			//click on signin
			driver.findElement(By.xpath("//button[text()=\"Sign in\"]")).click();
		}
		@Test(priority=2)
		public void menu() {
			//click on menu button
			driver.findElement(By.xpath("//div[@id=\"appnavigator\"]/div/span")).click();
			//click on marketing menu
			driver.findElements(By.cssSelector(".menu-items-wrapper.app-menu-items-wrapper")).get(0).click();
			//click on contact option
			driver.findElements(By.cssSelector("#mCSB_1_container>li>a>span:nth-child(2)")).get(0).click();
			}
		@Test(priority=3)
		public void addcontact() {
			//identify first name field
			driver.findElements(By.cssSelector("div#appnavcontent>ul>li>button")).get(0).click();
			//enter first name
			driver.findElement(By.xpath("//input[@name=\"campaignname\"]")).sendKeys("testcampaign",Keys.TAB);
			driver.switchTo().activeElement().sendKeys(Keys.SPACE,Keys.ARROW_DOWN,Keys.ENTER,Keys.TAB);
			driver.switchTo().activeElement().sendKeys(Keys.SPACE,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER,Keys.TAB);
			driver.switchTo().activeElement().sendKeys(Keys.SPACE,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER,Keys.TAB,Keys.TAB);
			driver.switchTo().activeElement().sendKeys(Keys.TAB,Keys.SPACE,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
			driver.findElement(By.xpath("//button[text()='Save']")).click();}
		
		@Test(priority=4)
		public void editcontact() throws InterruptedException {
			driver.findElement(By.xpath("//a[@title='Campaigns']/h4")).click();
			//search contact by enter campaign name
			driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys("testcampaign");
			//click on search button			
			driver.findElement(By.cssSelector(".btn.btn-success.btn-sm")).click();
			//click on chekbox
			for(int i=0; i<=5;i++){
				try{
				driver.findElement(By.xpath("//tr[td[span[span[a[text()='testcampaign']]]]]/td[1]/div/span[1]/input")).click();
				 break;
				 }
				 catch(Exception e){}
				}			//click on edit button
				driver.findElement(By.id("Campaigns_listView_massAction_LBL_EDIT")).click();
				//update status
			
				driver.findElement(By.cssSelector(".inputElement.nameField")).click();
				driver.switchTo().activeElement().sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
				//update campaign type
				Thread.sleep(5000);

				driver.switchTo().activeElement().sendKeys(Keys.TAB,Keys.TAB,Keys.ENTER,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
				Thread.sleep(5000);
				//click on save button
				WebDriverWait wait= new WebDriverWait(driver,30);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		
				driver.findElement(By.xpath("//button[text()='Save']")).click();
		}
  }

