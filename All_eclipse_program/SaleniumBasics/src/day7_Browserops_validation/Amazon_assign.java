package day7_Browserops_validation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

//Amazon website
public class Amazon_assign {

	public static void main(String[] args) {
		//set the driver executable path using System.setproperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
				
		//create an instance of required browser class
		ChromeDriver driver=new ChromeDriver();
		// get required browser url
		driver.get("https://www.amazon.in/");
		
		//set size of browser
		driver.manage().window().setSize(new Dimension (400,650));
		//again maximize browser size
		driver.manage().window().maximize();
		//get current page title and print 
		String Homepage_title =driver.getTitle();
		System.out.println("Title of home page: "+Homepage_title );
		
		// click on Best Seller 
		driver.findElement(By.partialLinkText("Best Sellers")).click();
		
		// get title of Best Seller page title and print
		System.out.println("Title of best seller in amazon:"+driver.getTitle());
		
		// Navigate back to the home page
		driver.navigate().back();
		
		//get title of current page and match with home page title
		System.out.println("match title with home page title: "+driver.getTitle().equals(Homepage_title) );
		
		//close browser
		driver.close();
	}}			