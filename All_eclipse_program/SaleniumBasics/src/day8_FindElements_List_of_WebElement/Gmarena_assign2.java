package day8_FindElements_List_of_WebElement;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Gmarena_assign2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com");
		
		
		//click on samsung link
		List<WebElement> phone =driver.findElements(By.cssSelector(".brandmenu-v2>ul>*"));
		phone.get(0).click();
		//check pagination
		List<WebElement> pagination = driver.findElements(By.cssSelector(".nav-pages>*"));
		System.out.println("number of pages:"+pagination.size());
//		pagination.get(3).click();
//		System.out.println("page"+"k"+"url is :"+driver.getCurrentUrl());
		
		for(int k=2;k<pagination.size();k++) {
			
			pagination.get(k);
			System.out.println("page"+"k"+"url is :"+driver.getCurrentUrl());

		}
		driver.close();
		
	}

}
