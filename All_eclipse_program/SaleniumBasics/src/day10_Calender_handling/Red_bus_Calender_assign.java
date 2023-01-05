package day10_Calender_handling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Red_bus_Calender_assign {

	public static void main(String[] args) {
		//set the driver executable path using System.setproperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");	
		//create an instance of required browser class
		ChromeDriver driver=new ChromeDriver();
		//maximize browser window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//enter URL
		driver.get("https://www.redbus.in");
		//click on  "from" input field and enter source city
		driver.findElement(By.id("src")).sendKeys("pune");
		//Select city in drop down list
		List<WebElement> a =driver.findElements(By.cssSelector("ul[class=\"autoFill homeSearch\"]>*"));
		a.get(1).click();
		//click on  "to" input field and enter destination city
		driver.findElement(By.id("dest")).sendKeys("goa");
		// select destination city in drop down list
		List<WebElement> b =driver.findElements(By.cssSelector("ul[class=\"autoFill homeSearch\"]>*"));
		b.get(1).click();
		
		//select calendar date
		List<WebElement> c= driver.findElements(By.cssSelector("table[class=\"rb-monthTable first last\"]>tbody>tr:nth-of-type(5)>*"));
		c.get(6).click();
		
		//click on search button
		driver.findElement(By.id("search_btn")).click();
		
		//select Bus type AC			
		driver.findElement(By.cssSelector(".filter-details.f-12.d-color>*:nth-of-type(2)>*:nth-of-type(3)>li:first-child>label:nth-of-type(1)")).click();
		
		//select departure time after 6 pm
		driver.findElement(By.cssSelector(".dept-time.dt-time-filter>li:nth-of-type(1)>label")).click();
		
		//total count of buses 
		List<WebElement> Bus_list=driver.findElements(By.cssSelector(".travels.lh-24.f-bold.d-color"));
//		System.out.println(Bus_list.get(0).getText());
		System.out.println(Bus_list.size());
		for (int i=0;i<Bus_list.size();i++) {
			System.out.println(Bus_list.get(i).getText());
		}
//		driver.close();
	}

}
