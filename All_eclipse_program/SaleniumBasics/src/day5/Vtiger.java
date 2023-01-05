package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		ChromeDriver driver0= new ChromeDriver();
		
		driver0.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		String url = driver0.getCurrentUrl();
		System.out.println(url.equals("https://demo.vtiger.com/vtigercrm/index.php"));
		
		String title = driver0.getTitle();
		System.out.println(title);
		System.out.println(title.equals("vtiger"));
		
		System.out.println(driver0.getPageSource().length());
		
//		driver0.close();
		
		WebElement usrname= driver0.findElement(By.id("username"));
		usrname.clear();
		usrname.sendKeys("admin");
		
		WebElement pass = driver0.findElement(By.id("password"));
		pass.clear();
		pass.sendKeys("Test@123");
		
		driver0.findElement(By.className("buttonBlue")).click();;
		
	}

}
