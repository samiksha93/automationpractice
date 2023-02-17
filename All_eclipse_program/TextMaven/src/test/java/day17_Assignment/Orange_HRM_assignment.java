package day17_Assignment;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.SeleniumUtility;

public class Orange_HRM_assignment extends SeleniumUtility {
	WebDriver driver;
	@BeforeTest()
	  public void open_url() {
		driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/");
	}

	@Test
	public void Login() throws InterruptedException {

  		
  		//Enter username
  		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("");
  		//Enter password
  		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("");
  		//click on login
  		driver.findElement(By.xpath("//button[@type='submit']")).click();
  		
  		
  		//select pin option
  		driver.findElement(By.xpath("//ul[@class=\"oxd-main-menu\"]/li[2]/a/span")).click();
  		//click on add button
  		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
  		//Enter first name
  		driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("somya");
  		//Enter last name
  		driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("thakur");
  		//Find locator for id
  		WebElement id = driver.findElement(By.xpath("//div[@class=\"oxd-grid-2 orangehrm-full-width-grid\"]//input[@class=\"oxd-input oxd-input--active\"]"));
  		//clear default id and send new id
  		id.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),"0230");
  		//click on save button
  		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
  		
  		
  		//Again select pin option
  		driver.findElement(By.xpath("//ul[@class=\"oxd-main-menu\"]/li[2]/a/span")).click();
  		//Enter Employee name to find records
//  		driver.findElement(By.xpath("//div[@class=\"oxd-autocomplete-text-input oxd-autocomplete-text-input--active\"][1]/input")).sendKeys("somya");
  		//Enter id
  		driver.findElement(By.xpath("//div[@class=\"oxd-grid-item oxd-grid-item--gutters\"][2]//input")).sendKeys("0230");;
  		//click on search button
  		driver.findElement(By.xpath("//button[text()=' Search ']")).click();
  		//click on edit button
  		WebDriverWait wait3=new WebDriverWait(driver,20);
  		wait3.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type=\"button\"]:nth-of-type(2)")));
  		driver.findElement(By.cssSelector("button[type=\"button\"]:nth-of-type(2)")).click();
  		//click on job
  		driver.findElement(By.cssSelector(".orangehrm-tabs-wrapper:nth-of-type(6)>a")).click();
  		
  		//click on job title
  		driver.findElement(By.cssSelector(".oxd-grid-item.oxd-grid-item--gutters:nth-of-type(2) .oxd-icon.bi-caret-down-fill.oxd-select-text--arrow")).click();
  		//select QA engineer 
  		driver.findElement(By.xpath("//div[@role=\"listbox\"]/div[18]/span")).click();
  		//click on save button
  		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"][1]")).click();
  		Thread.sleep(6000);
  		
  		//Again select pin option
  		driver.findElement(By.xpath("//ul[@class=\"oxd-main-menu\"]/li[2]/a/span")).click();
  		//Enter Employee name to find records
  		driver.findElement(By.xpath("//div[@class=\"oxd-autocomplete-text-input oxd-autocomplete-text-input--active\"][1]/input")).sendKeys("somya");
  		//Enter id
  		driver.findElement(By.xpath("//div[@class=\"oxd-grid-item oxd-grid-item--gutters\"][2]//input")).sendKeys("0230");;
  		//click on search button 
  		driver.findElement(By.xpath("//button[text()=' Search ']")).click();
  		Thread.sleep(2000);
  		//click on delete button
  		driver.findElement(By.cssSelector("button[type=\"button\"]:nth-of-type(1)")).click();
  		driver.findElement(By.xpath("//div[@class=\"oxd-table-card\"]/div/div[9]/div[1]//button[1]")).click();
  		Thread.sleep(2000);
  		// confirm to delete
  		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin\"]")).click();
//  		Thread.sleep(5000);
  				
  		//Check Error msg NoRecords Found show or not
  		WebElement msg = driver.findElement(By.xpath("//span[text()=\"No Records Found\"]"));
  		System.out.println(msg.isDisplayed());
  		Thread.sleep(1000);
  		driver.close();

  	}

  

}
