package day9_Dropdownlist_handling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribue_method_instead_getText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		List<WebElement> menu = driver.findElements(By.cssSelector("div[id=\"nav-xshop-container\"]>div>a"));
		int size_=menu.size();
		System.out.println(size_);
		for (int i=0;i<size_;i++) {
			if(!menu.get(i).getText().isEmpty()) {
				System.out.println(menu.get(i).getText());
			}else {
			System.out.println(menu.get(i).getAttribute("innerHTML"));
		}}
		driver.close();
	
	}

}
