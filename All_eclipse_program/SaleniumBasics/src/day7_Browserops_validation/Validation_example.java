package day7_Browserops_validation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_example {

	public static void main(String[] args) {
		//set browser driver executable path by using system.setProperty 
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// create instance of browser driver
		ChromeDriver driver= new ChromeDriver();
		// set implicit wait to map script and application speed
		driver.manage().timeouts().implicitlyWait(30, TimeUnit .SECONDS);
		
		driver.get("https://demo.automationtesting.in/Register.html");
		System.out.println(driver.getTitle());
		
		WebElement firstnamefield = driver.findElement(By.className("ng-pristine"));
		/*
		 * visible --- isDisplayed()
		 * Editable--- isEnabled()
		 * Default value- getAttribute(String attributename)
		 */
		 System.out.println("firstname field is display or not : "+firstnamefield.isDisplayed());
		 System.out.println("firstname field is enable or not : "+firstnamefield.isEnabled());
		
		 String firstname_value=firstnamefield.getAttribute("placeholder");
		 System.out.println(firstname_value);
		 System.out.println("Default value validation status: "+firstname_value.equals("First Name"));
		 
		 WebElement male_radiobutton = driver.findElement(By.name("radiooptions"));
		 System.out.println("radio button male is display or not :"+ male_radiobutton.isDisplayed());
		 System.out.println("radio button male is enable or not :"+ male_radiobutton.isEnabled());
		 System.out.println("Male radio button default selection status? "+ male_radiobutton.isSelected());	
		 male_radiobutton.click();
		 System.out.println("After selection, Male radio button selection status? "+ male_radiobutton.isSelected());	
		 
		 
		 //		 driver.close();
	}

}
