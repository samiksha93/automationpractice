package Day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_page {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		String fb_title = driver.getTitle();
		
		System.out.println("fb title : "+fb_title);
		System.out.println("length of fb_title : "+fb_title.length());
		System.out.println(fb_title.equals("Facebook – log in or sign up"));
		
		String fb_url= driver.getCurrentUrl();
		System.out.println("current url is : "+fb_url);
		
		String page_source=driver.getPageSource();
//		System.out.println("page_source of fb is :"+page_source);
		System.out.println("lenth of page source is : "+page_source.length());
		
		
		driver.close();

	}

}
