package day8_FindElements_List_of_WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Csslocator_findelements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//get size of links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("size of links:"+links.size());
		
		//get size of input fileds
		List<WebElement> inputFields = driver.findElements(By.tagName("input"));
		System.out.println("size of inputfield :"+ inputFields.size());
		
		List<WebElement> classObject = driver.findElements(By.cssSelector(".ng-pristine"));
		System.out.println("size of classObject: "+classObject.size());
		
		classObject.get(1).sendKeys("samiksha");
		classObject.get(2).sendKeys("rajpoot");
		classObject.get(3).sendKeys("kharadi,pune");
		classObject.get(4).sendKeys("abc@gmail.com");
		
		
	}

}
