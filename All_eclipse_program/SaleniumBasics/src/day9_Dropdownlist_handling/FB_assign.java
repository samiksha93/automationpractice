package day9_Dropdownlist_handling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_assign {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		//click on create new account 
		driver.findElement(By.partialLinkText("Create")).click();
		
		//identify day field 
		WebElement day = driver.findElement(By.id("day"));
		//******create instance of select class and pass above element in constructor******
		Select selectday = new Select(day);
		
		//check day field is display or not 
		System.out.println("Day field is display or not :"+day.isDisplayed());
		//check day field is Enable or not 
		System.out.println("Day field is Enable or not :"+day.isEnabled());
		//check day field is Multiselect or not 
		System.out.println("Day field is Multiselect or not :"+selectday.isMultiple());
		//get the default value of day field
		System.out.println("default value of day filed : "+selectday.getFirstSelectedOption().getText());
		//change day in day field
		day.sendKeys("6");
		//check updated day 
		System.out.println("updated day in day field:"+selectday.getFirstSelectedOption().getText());
		
		//get options in day field
		List<WebElement> day_option =selectday.getOptions();
		System.out.println("option avilabe in day field:"+day_option.size());
		
		for (int i=0; i<day_option.size();i++) {
			System.out.println(day_option.get(i).getText());
		}
 		
		System.out.println("**********************************************************************************");
		
		WebElement month = driver.findElement(By.id("month"));
		System.out.println(month.isDisplayed());
		System.out.println(month.isEnabled());


		
		WebElement year = driver.findElement(By.id("year"));
		System.out.println(year.isDisplayed());
		System.out.println(year.isEnabled());


	}

}
