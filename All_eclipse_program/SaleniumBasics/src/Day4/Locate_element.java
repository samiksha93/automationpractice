package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locate_element {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demosite.executeautomation.com");
		
		System.out.println("url : "+ driver.getCurrentUrl());
		
		String Title = driver.getTitle();
		System.out.println("title : "+Title);
		System.out.println("length of title : "+Title.length());
		
		WebElement Input_username = driver.findElement(By.name("UserName"));
		Input_username.sendKeys("execution");
		
		WebElement Input_password = driver.findElement(By.name("Password"));
		Input_password.sendKeys("admin");
		
		WebElement loginInputField = driver.findElement(By.name("Login"));
		
		loginInputField.submit();
		
		WebElement logoutField = driver.findElement(By.tagName("span"));
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.tagName("span")));
		logoutField.click();
//		driver.close();
	
			

	}

}

