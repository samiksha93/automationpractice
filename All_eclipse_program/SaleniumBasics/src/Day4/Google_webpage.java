package Day4;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_webpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		System.out.println("url : "+driver.getCurrentUrl());
		
		String title = driver.getTitle();
		System.out.println("Title : "+ title);
		System.out.println("title length : "+title.length() );
		
		String page_source =driver.getPageSource();
//		System.out.println("page source : "+page_source);
		System.out.println("lenth of page source  : "+page_source.length());
		
		driver.close();
	}

}
