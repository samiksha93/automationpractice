package Day17_Frame_Alert_Window_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class Handling_frame_example {

	static WebDriver driver;
	public static void main(String[] args) {
		SeleniumUtility util = new SeleniumUtility();
		driver=util.setUp("chrome","https://jqueryui.com/");
		
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		//1.taking control inside the frame from main page using index
		//driver.switchTo().frame(0);
		
		//2.taking control inside the frame from main page using WebElement
		WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(frame);		
		
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		util.performDragAndDrop(src, target);
		//coming back to main page from the frame
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector(".logo")).click();
	    //util.cleanUp();
	}

}