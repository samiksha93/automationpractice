package day8_FindElements_List_of_WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_assign {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Mannual intervew question");;
		
		List<WebElement> sugg = driver.findElements(By.cssSelector("ul>li>div>div:nth-of-type(2)>*:first-child>span"));

		System.out.println(sugg.size());
		for (int i=0;i<sugg.size();i++) {
			System.out.println(sugg.get(i).getText());
		}
		sugg.get(1).click();
		driver.close();
	}

}
