package day14_Mouse_operation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example2 {

	public static void main(String[] args) throws InterruptedException {
		String chromeExePath=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//to enter required application URL using get() method
		driver.get("https://www.globalsqa.com/demo-site/");
		
		// identify all the elements of main menu
		List<WebElement> mainMenu = driver.findElements(By.xpath("//div[@id='menu']/ul/li/a"));
		System.out.println("Main Menu option count: " + mainMenu.size());
		
		Actions act = new Actions(driver);
		
//		mouseHoverOverInTheElement(act, mainMenu.get(1));
		/** to do hover over the Home option */
//		list_element(act, mainMenu);
		/**Mouse hover with cords */
//		mouseHoverWithCords(act,mainMenu.get(2),100,0);
		/**Right click on required Element */
		rightClick(act, mainMenu.get(1));
		}
	
		
		//method for get one element from th list
		static void mouseHoverOverInTheElement(Actions act, WebElement element) {
			act.moveToElement(element).perform();
		}
		
		/** to do hover over the Home option */
		//method to get element on by one from list
		static void list_element(Actions act ,List<WebElement> element) throws InterruptedException {
			for (int i=0;i<element.size();i++) {
				act.moveToElement(element.get(i)).perform();
				Thread.sleep(1000);
			}}
		
		/**Mouse hover with cords */
		//METHOD 
		static void mouseHoverWithCords(Actions act, WebElement option, int x, int y) {
			System.out.println("Option name is : " + option.getText());
			act.moveToElement(option, x, y).perform();
		}
		
		/**Right click on required Element */
		//method
		static void rightClick(Actions act , WebElement element) {
			act.moveToElement(element).contextClick().build().perform();
		}
		
		
	}


