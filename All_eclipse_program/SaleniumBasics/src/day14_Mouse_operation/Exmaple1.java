package day14_Mouse_operation;

import java.util.ResourceBundle.Control;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exmaple1 {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//to enter required application URL using get() method
		driver.get("http://demo.automationtesting.in/Register.html");
		Actions act = new Actions(driver);
		WebElement first_name= driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		first_name.sendKeys("admin");
		act.moveToElement(first_name).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		WebElement lastName=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
	
		act.moveToElement(lastName).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
	}

}
