package Day12_Xpath;
/*
 * Assignment =https://www.demoblaze.com/ --> Locator for price of  samsung galaxy s6
 * */
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//to enter required application URL using get() method
		driver.get("https://www.demoblaze.com/");
		
		//Locate all Mobile 
		List<WebElement> mobile_type=driver.findElements(By.xpath("//div[@class=\"card-block\"]//h4/a"));
		
		//locate all mobile price //div[@class="card-block"]//h5
		List<WebElement> price1=driver.findElements(By.xpath("//div[@class=\"card-block\"]/h5"));
		
		//get the name and price of mobile using index
		System.out.println("Price of "+mobile_type.get(1).getText()+"  is : "+price1.get(1).getText());
		
		//second method
		WebElement price2 = driver.findElement(By.xpath("//div[h4[a[text()='Samsung galaxy s6']]]/h5"));
		System.out.println("using mobile name directly : "+price2.getText());
		driver.close();
	}

}
