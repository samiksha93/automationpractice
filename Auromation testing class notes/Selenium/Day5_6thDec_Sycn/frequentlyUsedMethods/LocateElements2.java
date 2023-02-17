package day2.frequentlyUsedMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElements2 {

	public static void main(String[] args) {
		// setup the required driver executable path using - System.setProperty(String
		// key, String value)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// create an instance of required browser driver class
		// example for runtime poly- Inheritance, upcasting & overriding
		WebDriver driver = new ChromeDriver();
		// enter the required URL
		driver.get("https://demo.actitime.com/login.do");
		//type user name as admin
//		WebElement usernameInputField=driver.findElement(By.id("username"));
//		usernameInputField.sendKeys("admin");
				//or
		driver.findElement(By.id("username")).sendKeys("admin");
		/*Identify password field */
//		WebElement passwordInputField=driver.findElement(By.name("pwd"));
//		passwordInputField.sendKeys("manager");
				//or
		driver.findElement(By.name("pwd")).sendKeys("manager");
		/*identify login button*/
//		WebElement loginBtn=driver.findElement(By.id("loginButton"));
//		loginBtn.click();
				//or
		driver.findElement(By.id("loginButton")).click();
		//close the browser
		driver.close();
	}
}
/**
Open chrome browser
Enter actitime url
type user name as admin
type password as manager
click on login button

*/