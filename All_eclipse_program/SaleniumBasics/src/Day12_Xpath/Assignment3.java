package Day12_Xpath;
import java.util.List;
/*
 * Assignment3= https://www.nseindia.com  --> volume for HDFCBANK 
 * */
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//to enter required application URL using get() method
		driver.get("https://www.nseindia.com");
		
		
		//locate name of the gainer stocks
		List<WebElement> topgainer_stocks_list =driver.findElements(By.xpath("//table[@id=\"tab1Ganier\"]/tbody/tr/td[1]/a"));
		//locate volume of the gainer stocks
		List<WebElement> Top_gainer = driver.findElements(By.xpath("//table[@id=\"tab1Ganier\"]/tbody/tr/td[4]"));
		
		//print top first gainer stock name and volume
			System.out.println("Top first gainer stock    "+ topgainer_stocks_list.get(0).getText()+"   volume is -->  "+Top_gainer.get(0).getText());
		//print top second gainer stock name and volume 
			System.out.println("Top second gainer stock    "+ topgainer_stocks_list.get(1).getText()+"   volume is -->  "+Top_gainer.get(1).getText());
		//print top third gainer stock name and volume
			System.out.println("Top third gainer stock    "+ topgainer_stocks_list.get(2).getText()+"   volume is -->  "+Top_gainer.get(2).getText());
		//print top forth gainer stock name and volume
			System.out.println("Top forth gainer stock    "+ topgainer_stocks_list.get(3).getText()+"    volume is -->  "+Top_gainer.get(3).getText());
		//print top fifth gainer stock name and volume
			System.out.println("Top fifth gainer stock    "+ topgainer_stocks_list.get(4).getText()+"    volume is -->  "+Top_gainer.get(4).getText());
		
			System.out.println("********************************************************");
			WebDriverWait wait3=new WebDriverWait(driver,20);
			wait3.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//tr[td[a[text()='M&M']]]/td[4]")));
			
			WebElement stock = driver.findElement(By.xpath("//tr[td[a[text()='M&M']]]/td[4]"));
			System.out.println("M&M volume is  :"+stock.getText());
			
			driver.close();
	}

}
