package day17_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Opencart_assignment_no_3 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.findElement(By.id("input-username")).sendKeys("admin",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("test",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("user",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("abc@gamil.com",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("india",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("test123",Keys.TAB);
		WebElement text=driver.findElement(By.cssSelector(".bg-info>strong"));
		System.out.println(text.getText());
	}

}
