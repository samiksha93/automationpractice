package day17_Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import utilities.SeleniumUtility;

public class Sort_assignment_no_6 {

	public static void main(String[] args) {
		SeleniumUtility s1= new SeleniumUtility();
		WebDriver driver= s1.setUp("chrome","https://jqueryui.com/sortable/");
		WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(frame);	
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		List<WebElement> item = driver.findElements(By.cssSelector(".ui-sortable>li"));
		
		for (int i=item.size()-1;i>=0;i--) {
			s1.performDragAndDrop(item.get(i),item.get(0));
		}
//		s1.performDragAndDrop(item.get(6), item.get(0));
//	 	s1.performDragAndDrop(item.get(5), item.get(0));
//	 	s1.performDragAndDrop(item.get(4), item.get(0));
//	 	s1.performDragAndDrop(item.get(3), item.get(0));
//	 	s1.performDragAndDrop(item.get(2), item.get(0));
//	 	s1.performDragAndDrop(item.get(1), item.get(0));
		System.out.println("end program");
//		driver.close();
	}

}
