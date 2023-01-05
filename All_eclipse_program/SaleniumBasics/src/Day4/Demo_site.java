package Day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo_site {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://demosite.executeautomation.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("url : "+ driver.getCurrentUrl());
		
		String Title = driver.getTitle();
		System.out.println("title : "+Title);
		System.out.println("length of title : "+Title.length());
		
		WebElement Input_username = driver.findElement(By.name("UserName"));
		Input_username.sendKeys("execution");
		
		WebElement Input_password = driver.findElement(By.name("Password"));
		Input_password.sendKeys("admin");
		driver.findElement(By.id("userName")).click();
		
		
		WebElement loginInputField = driver.findElement(By.name("Login"));
		loginInputField.submit();
//		WebElement categories=driver.findElement(By.cssSelector(".list-group>*:nth-child(1)"));
		WebElement logoutField = driver.findElement(By.cssSelector("#cssmenu>*:nth-child(1)>*:first-child>*:first-child>*:first-child"));
		System.out.println(logoutField.getText());
//		logoutField.click();
//		driver.close();
		

		
//		WebDriverWait wait=new WebDriverWait(driver,50);
//		wait.until(ExpectedConditions.elementToBeClickable(By.getText("Logout")));

	}}