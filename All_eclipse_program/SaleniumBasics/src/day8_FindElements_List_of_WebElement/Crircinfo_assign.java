package day8_FindElements_List_of_WebElement;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crircinfo_assign {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.cricinfo.com/");
		
		List<WebElement> main_menu = driver.findElements(By.cssSelector("div[class=\"ds-flex ds-items-center ds-justify-between ds-flex-1\"]>div:first-child>*"));
		System.out.println("main menu size is :"+main_menu.size());
		for(int i=0;i<main_menu.size();i++) {
			System.out.println(main_menu.get(i).getText());
		}
		driver.close();

	}

}
