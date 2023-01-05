package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm_web {

	public static void main(String[] args) {
		// set required browser driver executable  path by using System.setProperty(key,value)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		// create instance of required browser class
		ChromeDriver org_driver = new ChromeDriver();
		
		//set implicit wait for browser 
		org_driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//enter application url
		org_driver.get("https://opensource-demo.orangehrmlive.com");
		
		String url =org_driver.getCurrentUrl() ;
		System.out.println("url   "+url);
		System.out.println(url.equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
		
		String Title = org_driver.getTitle();
		System.out.println(Title.equals("OrangeHRM"));
		
//		System.out.println(org_driver.getPageSource());
		System.out.println(org_driver.getPageSource().length());
		
		WebElement usrname =org_driver.findElement(By.name("username"));
		usrname.sendKeys("Admin");
		
		WebElement pass = org_driver.findElement(By.name("password"));
		pass.sendKeys("admin123");
		
		WebElement lgn= org_driver.findElement(By.tagName("button"));
		lgn.click();
		
		String url1= org_driver.getCurrentUrl() ;
		System.out.println(url1);
		System.out.println(url1.equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"));
				
		
		
		

	}

}
