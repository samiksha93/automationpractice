package day2.frequentlyUsedMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElements3 {

	public static void main(String[] args) {
		// setup the required driver executable path using - System.setProperty(String
		// key, String value)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// create an instance of required browser driver class
		// example for runtime poly- Inheritance, upcasting & overriding
		WebDriver driver = new ChromeDriver();
		// enter the required URL
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("Login page title: "+driver.getTitle());
		//type user name as admin
		driver.findElement(By.id("username")).sendKeys("admin");
		/*type password as manager */
		driver.findElement(By.name("pwd")).sendKeys("manager");
		/*click on login button*/
		driver.findElement(By.id("loginButton")).click();
		//click on logout link
		driver.findElement(By.id("logoutLink")).click();//it will give NoSuchElemenet Exception, as our automation script speed is not in sync with Application
		//close the browser
		//driver.close();
	}
}
/**
Open chrome browser
Enter actitime url
type user name as admin
type password as manager
click on login button

*/