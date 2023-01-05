package Day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitme_webpage {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			
			String actitime_title = driver.getTitle();
			System.out.println("actitime title is : "+actitime_title);
			System.out.println("length of actitime title is : "+actitime_title.length());
			System.out.println(actitime_title.equals("actiTIME - Login"));
			
			String actitime_url = driver.getCurrentUrl();
			System.out.println("current url is : "+actitime_url);
			
			
			String Page_source= driver.getPageSource();
//			System.out.println("page_source:"+Page_source);
			System.out.println("page_source length is : "+Page_source.length());	
			
//			driver.close();

	}

}
