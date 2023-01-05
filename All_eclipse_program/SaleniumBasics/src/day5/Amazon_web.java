package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_web {

	public static void main(String[] args) {
		
		// set browser driver path 
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		// create instance of required browser class
		ChromeDriver driver = new ChromeDriver();
		
		//set implicit wait for browser 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// enter apllication url
		driver.get("https://www.amazon.in/");
		
		String url = driver.getCurrentUrl();
		System.out.println(url.equals("https://www.amazon.in/"));
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
		String page_source = driver.getPageSource();
		System.out.println(page_source.length());
		
	}

}