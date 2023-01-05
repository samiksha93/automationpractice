package day6;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fluent_wait_example {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		String title = driver.getTitle();
		System.out.println("title :"+title);
		
		String url = driver.getCurrentUrl();
		System.out.println("url :"+url );
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();;
		
		System.out.println("title after login :"+driver.getTitle());
		//create an instance of WebDriverWait
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
				
		System.out.println("Home page title: "+driver.getTitle());
		
		FluentWait wait1=new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);

		wait1.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		
		driver.findElement(By.id("logoutLink")).click();
		
	
	}

}

