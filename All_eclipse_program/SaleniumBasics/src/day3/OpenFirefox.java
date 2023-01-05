package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.lang.Thread;  
import java.io.*;

public class OpenFirefox {

	public static void main(String[] args) throws InterruptedException {
		
		//set the driver executable path using System.setproperty(String key,String value)
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		
		//create an instance of required browser class
		FirefoxDriver cdriver=new FirefoxDriver();
		cdriver.get("https://www.facebook.com/login/");
		WebElement usernameInputField=cdriver.findElement(By.id("email"));
		usernameInputField.sendKeys("anshurajpoot1516@gmail.com");
		WebElement passwordInputField=cdriver.findElement(By.id("pass"));
		passwordInputField.sendKeys("9329181519");
		WebElement loginInputField=cdriver.findElement(By.id("loginbutton"));
		loginInputField.click();
		Thread.sleep(5000);  
		cdriver.close();
		/**
		 * Every time Selenium will launch new browser
		 * Browser opened by Selenium won't be having 
		 * 			1. History
		 * 			2. plugins
		 * 			3. cookies
		 */
	}
}