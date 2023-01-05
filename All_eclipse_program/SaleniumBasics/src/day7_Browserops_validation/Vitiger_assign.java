package day7_Browserops_validation;
//vtiger website
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Vitiger_assign {

	public static void main(String[] args) throws InterruptedException {
		// set required browser driver executable path using System.setProperty(key,value)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// create instance of required browser class
		WebDriver driver = new ChromeDriver();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//maximize browser
		driver.manage().window().maximize();
		// enter the required URL
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");	
		System.out.println(driver.getCurrentUrl());
		
		String title = driver.getTitle();
		//validate the title
		System.out.println("validate the title :"+ title.equals("vtiger"));
		
		//locate username 
		WebElement usrname = driver.findElement(By.id("username"));
		//claer exist username
		usrname.clear();
		// enter username
		usrname.sendKeys("admin");
		
		//locate password
		WebElement pass = driver.findElement(By.id("password"));
		//clear exist password
		pass.clear();
		//enter password
		pass.sendKeys("Test@123");
		
		//click on signin button
		driver.findElement(By.className("buttonBlue")).click();
		
		//validate home page
		System.out.println("validate Home page :"+ driver.getTitle().equals("Home"));
		
		// click on Add widget 
		driver.findElement(By.className("addButton")).click();
		
		
		//select widget 
		List<WebElement> widget = driver.findElements(By.cssSelector("ul[class=\"dropdown-menu dropdown-menu-right widgetsList pull-right\"]>*"));
		System.out.println("size of widget:"+widget.size());
		
		//Add 0 number widget
		widget.get(0).click();
		//delete history widget
		driver.findElement(By.cssSelector("a[name=dclose]>i")).click();	
		//click on yes to confirm delete
		driver.findElement(By.cssSelector(".modal-footer>*:last-child")).click();
		System.out.println("0 no widget:"+widget.get(0).getText());
		
		//Add 13 number widget
		driver.navigate().refresh();
		List<WebElement> widget1 = driver.findElements(By.cssSelector("ul[class=\"dropdown-menu dropdown-menu-right widgetsList pull-right\"]>*"));
		driver.findElement(By.className("addButton")).click();
		widget1.get(5).click();
		//delete history widget
//		driver.findElement(By.cssSelector("a[name=dclose]>i")).click();	
		//click on yes to confirm delete
//		driver.findElement(By.cssSelector(".modal-footer>*:last-child")).click();
	
//		System.out.println("13 no widget:"+widget.get(13).getText());
//		System.out.println("14 no widget:"+widget.get(14).getText());

		for (int i=0;i<widget.size();i++) {
		System.out.println(widget.get(i).getText());
		}
		//click on admin	
//		driver.findElement(By.className("fa-user")).click();
		
		// click on signout
//		driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();;
		
//		driver.close();
	}

}
