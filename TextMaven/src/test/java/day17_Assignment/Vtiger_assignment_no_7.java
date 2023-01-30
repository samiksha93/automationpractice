package day17_Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Vtiger_assignment_no_7 {

	public static void main(String[] args) {
		
		SeleniumUtility s1= new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome","https://demo.vtiger.com/vtigercrm/index.php");
		//click on signin
		driver.findElement(By.xpath("//button[text()=\"Sign in\"]")).click();
		//click on menu button
		driver.findElement(By.xpath("//div[@id=\"appnavigator\"]/div/span")).click();
		//click on marketing menu
		driver.findElements(By.cssSelector(".menu-items-wrapper.app-menu-items-wrapper")).get(0).click();
		//click on contact option
		driver.findElements(By.cssSelector("#mCSB_1_container>li>a>span:nth-child(2)")).get(2).click();
		//click on add contact 
		driver.findElements(By.cssSelector("div#appnavcontent>ul>li>button")).get(0).click();
		//enter first name
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("testcontact",Keys.TAB);
		//enter last name
		driver.switchTo().activeElement().sendKeys("testing",Keys.PAGE_DOWN);
		// click on assigned to field
		driver.findElement(By.id("s2id_autogen5")).click();
		//select option from assigned to dropdown
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		// click on save button
		driver.findElement(By.xpath("//button[text()=\"Save\"]")).click();
		//click on menu button
		driver.findElement(By.xpath("//div[@id=\"appnavigator\"]/div/span")).click();
		//again go to marketing menu
		driver.findElements(By.cssSelector(".menu-items-wrapper.app-menu-items-wrapper")).get(0).click();
		//again go to contact option
		driver.findElements(By.cssSelector("#mCSB_1_container>li>a>span:nth-child(2)")).get(2).click();
		//search contact by enter first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("testcontact");
		//click on search button
		driver.findElement(By.cssSelector(".btn.btn-success.btn-sm")).click();
		//click on check box
		//Handle StaleException using "try-catch block" within "for loop"
		for(int i=0; i<=5;i++){
				try{
				driver.findElement(By.xpath("//tr[td[span[span[a[text()='testcontact']]]]]/td[1]/div/span[1]/input")).click();
				 break;
				 }
				 catch(Exception e){}
				}
		//click on edit button
		driver.findElement(By.id("Contacts_listView_massAction_LBL_EDIT")).click();
		// enter mobile number and enter TAB
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9878787898",Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB);
		//Enter title
		driver.switchTo().activeElement().sendKeys("IT engineer",Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB);
		//Enter secondry phone
	
		driver.switchTo().activeElement().sendKeys("Testing");
			
		//click on save button 
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		for(int i=0; i<=5;i++){
			try{
			driver.findElement(By.xpath("//tr[td[span[span[a[text()='testcontact']]]]]/td[1]/div/span[1]/input")).click();
			 break;
			 }
			 catch(Exception e){}
			}
		driver.findElement(By.xpath("//button[@title='Delete']")).click();
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		
		System.out.println("delete contact successfully");
		
				
	
	
	}}
