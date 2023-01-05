package day13_keyboard_operation;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		String chromeExePath=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//to enter required application URL using get() method
		driver.get("https://www.flipkart.com/");
		
		//using Escape of keyboard to avoid login popup
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		

		Thread.sleep(1500);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.F5);
	}

}
