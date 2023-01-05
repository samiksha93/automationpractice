package Day16_ActiveElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utilities.SeleniumUtility;

public class Assignment_Automation_registerhtml {

	public static void main(String[] args) throws InterruptedException {
		
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome","https://demo.automationtesting.in/Register.html");
		
		//identify first name field and enter first name
		driver.findElement(By.cssSelector("input[placeholder=\"First Name\"]")).sendKeys("Automation",Keys.TAB);
		
		//switch to last name field
		driver.switchTo().activeElement().sendKeys("testing",Keys.TAB);	
		//switch to address 
		 driver.switchTo().activeElement().sendKeys("pune,Maharastra.",Keys.TAB);
		//switch to mobile 
		driver.switchTo().activeElement().sendKeys("abc@gmail.com",Keys.TAB);
		//enter phone
		driver.switchTo().activeElement().sendKeys("3497957239",Keys.TAB);
		//select gender
		driver.switchTo().activeElement().sendKeys((Keys.chord(Keys.ARROW_RIGHT,Keys.SPACE,Keys.TAB)));	
		//select hobbies
		driver.switchTo().activeElement().sendKeys((Keys.chord(Keys.TAB ,Keys.SPACE,Keys.TAB)));
		
		//click on language
		driver.findElement(By.id("msdd")).click();
		//select language
		driver.findElement(By.xpath("//li/a[text()='Hindi']")).click();
		
		
		driver.switchTo().activeElement().sendKeys(Keys.TAB,Keys.ENTER);
		//select skill
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		
		//click on arrow of country field
		driver.findElement(By.className("select2-selection__arrow")).click();
		//select country
		driver.findElement(By.xpath("//li[text()=\"India\"]")).click();
		
		//select year of birth  
		driver.switchTo().activeElement().sendKeys(Keys.TAB,Keys.ENTER,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER,Keys.TAB);
		//select month of birth 
		driver.switchTo().activeElement().sendKeys(Keys.ENTER,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER,Keys.TAB);
		//select date of birth
		driver.switchTo().activeElement().sendKeys(Keys.ENTER,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER,Keys.TAB);
		//enter password
		driver.switchTo().activeElement().sendKeys("abcde",Keys.TAB);
		//enter confirm password
		driver.switchTo().activeElement().sendKeys("abcde",Keys.TAB);
		//click on submit button
		driver.switchTo().activeElement().click();
		
		Thread.sleep(5000);
		driver.close();
	}
}

