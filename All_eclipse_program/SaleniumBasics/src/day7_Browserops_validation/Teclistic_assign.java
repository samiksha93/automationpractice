package day7_Browserops_validation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//tecklistic webside
public class Teclistic_assign {

	public static void main(String[] args) {
		// set browser driver path
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		// create instance of broser driver
		ChromeDriver driver = new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		// enter url 
		driver.get("https://www.techlistic.com");
	
		
		System.out.println(driver.getTitle());
		//maximize browser window
		driver.manage().window().maximize();
		// click on java link
		driver.findElement(By.className("overflowable-item")).click();
		//validate the page title
//		WebDriverWait wait=new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.titleContains("https://www.techlistic.com/p/java.html"));
		System.out.println(driver.getTitle());
//		System.out.println("validate title : "+driver.getTitle().equals("https://www.techlistic.com/p/java.html"));
		//back to the home page using navigate
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Selenium")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.findElement(By.partialLinkText("BDD")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
//		driver.close();
	}

}
