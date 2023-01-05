package day8_FindElements_List_of_WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsmarena_assign1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle().equals("GSMArena.com - mobile phone reviews, news, specifications and more..."));
		
		//count and print all phone name present in phone finder
		List<WebElement> phone =driver.findElements(By.cssSelector(".brandmenu-v2>ul>*"));
		System.out.println(phone.size()); //36
		for (int i=0;i<phone.size();i++) {
			WebElement phone_type =phone.get(i); //get(index) it gives tag
			System.out.println(" Phone name : "+phone_type.getText()); //it return text
			
		}
		
		//select samsung 
		phone.get(0).click();
		//count and print all type of phone under samaung categories 
		List<WebElement> samsung_categories = driver.findElements(By.cssSelector("#review-body>div.makers>ul>*"));
		System.out.println(samsung_categories.size());
		for (int j=0;j<samsung_categories.size();j++) {
			WebElement samsung = samsung_categories.get(j);
			System.out.println("samsung phone :"+samsung.getText());
		}
		
		
		driver.close();

	}

}
