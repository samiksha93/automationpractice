package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_automation {

	public static void main(String[] args) {
		// set browser driver path 
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		// create instance of required browser class
		ChromeDriver driver = new ChromeDriver();
		
		//set implicit wait for browser 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// enter apllication url
		driver.get("https://demo.automationtesting.in/Register.html");
		
		String url = driver.getCurrentUrl();
		System.out.println(url.equals("https://demo.automationtesting.in/Register.html"));
		String title = driver.getTitle();
		System.out.println(title.equals("Register"));
		String page_source = driver.getPageSource();
		System.out.println(page_source.length());
		
	}

}
