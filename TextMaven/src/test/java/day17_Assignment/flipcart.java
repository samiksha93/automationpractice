package day17_Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class flipcart {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		// Escape pop_up 
		try {
			driver.switchTo().activeElement().sendKeys(Keys.ESCAPE);
		} catch (Exception e) {
		}

		// find list of mainmenu
		List<WebElement> menu = driver.findElements(By.className("xtXmba"));

		// Iterate list of mainmenu
		for (int i = 0; i < menu.size(); i++) {
			// print main menu
			System.out.println("--> " + "main menu : " + i + "# " + menu.get(i).getText());
			// move pointer on all mainmenu 
			action.moveToElement(menu.get(i)).perform();

			// try if main menu has submenu
			try {
				// get the list of submenu of mainmenu
				List<WebElement> submenu = driver.findElements(By.xpath("//div[@class=\"_3XS_gI _7qr1OC\"]/a"));
				// Iterate list of sub menu 
				for (int j = 0; j < submenu.size(); j++) {
					// print submenu
					System.out.println("		" + j + ".  " + submenu.get(j).getText());
					// move cursor on submenu
					action.moveToElement(submenu.get(j)).perform();
					//pageup
					driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);

					try {
						// get list of options in submenu
						List<WebElement> option = driver.findElements(By.xpath("//div[@class=\"_3XS_gI\"]/a"));
						//Iterate list of options of submenu
						for (int k = 0; k < option.size(); k++) {
							//print all option of submenu
							System.out.println("				" + k + ".  " + option.get(k).getText());
							//move cursor on options
							action.moveToElement(option.get(k)).perform();
							//pageup
							driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
						}
					} catch (Exception e) {}
				 }
			} catch (Exception e) {}
		}
		//close browser
			driver.close();
	}
}