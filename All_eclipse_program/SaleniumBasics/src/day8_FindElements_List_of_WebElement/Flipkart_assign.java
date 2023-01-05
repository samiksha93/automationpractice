package day8_FindElements_List_of_WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_assign {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		//count and print flipkart main menu option
		List<WebElement> menu = driver.findElements(By.cssSelector("div[class=\"_37M3Pb\"]>*"));
		//count the main menu size
		System.out.println("main menu size is :"+menu.size());
		//print main menu name 
		for (int i=0;i<menu.size();i++) {
			System.out.println(menu.get(i).getText());
		}
		driver.close();
		
	}

}
