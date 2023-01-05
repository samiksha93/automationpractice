package Day12_Xpath;
/*
 * Assignment2=https://www.flipkart.com/samsung-mobile-store?otracker=nmenu_sub_Electronics_0_samsung
 * ---> Locator for price SAMSUNG Galaxy F13 (Nightsky Green, 64 GB)
 * */
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
		public static void main(String[] args) {
			String chromeExePath=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
			//setting the path for driver executable
			System.setProperty("webdriver.chrome.driver", chromeExePath);
			//creating an instance of Chrome browser and up-casting it to WebDriver interface
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			//to enter required application URL using get() method
			driver.get("https://www.flipkart.com/samsung-mobile-store?otracker=nmenu_sub_Electronics_0_samsung");
			
			//locator for all mobile
			List<WebElement> mobile = driver.findElements(By.xpath("//div[@class=\"_4ddWXP _3BCh3_\"]//a[@class=\"s1Q9rs\"]"));
			
			//Get the name of mobile using index
			System.out.println(mobile.get(5).getText());//SAMSUNG Galaxy F13 (Nightsky Green, 64 GB)
			
			//locator for  price of all mobile 
			List<WebElement> price = driver.findElements(By.xpath("//div[@class=\"_4ddWXP _3BCh3_\"]//div[@class=\"_30jeq3\"]"));
			
			//Get the price of mobile using index 
			System.out.println(price.get(5).getText());
			
			//second method dependent path
			WebElement price1 = driver.findElement(By.xpath("//div[div[div[a[text()='SAMSUNG Galaxy Z Flip3 5G (Phantom Black, 128 GB)']]]]/div/div[3]/div/div[1]"));
		}

}
