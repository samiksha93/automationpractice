package day11_CssAttribute_validation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
// Assignment : findout absolute xpath for username ,password and login field
public class Orangehrm_assign {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// create instance of required browser class
		ChromeDriver driver = new ChromeDriver();
		//maximize browser window
		driver.manage().window().maximize();
		//set implicit wait for browser 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//enter application URL
		driver.get("https://opensource-demo.orangehrmlive.com");
		//Absolute path for username input field 
		driver.findElement(By.xpath("html/body/div/div[1]/div/div/div/div[2]/div[2]/form/div/div/div[2]/input")).sendKeys("Admin");
		//Absolute path for password input field
		driver.findElement(By.xpath("html/body/div/div[1]/div/div/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
		//Absolute path for login 
		driver.findElement(By.xpath("html/body/div/div[1]/div/div/div/div[2]/div[2]/form/div[3]/button")).click();
		driver.navigate().back();
		//Absolute path for forget password
		driver.findElement(By.xpath("//div[1]//div[2]/div[2]/form/div[4]/p")).click();
	
	}

}
