package day10_Calender_handling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime_assign {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		driver.get("https://demo.actitime.com/login.do");
		//Enter username 
		driver.findElement(By.cssSelector("#username")).sendKeys("admin");
		//enter password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//click on login
		driver.findElement(By.cssSelector("#loginButton")).click();
		//click on "Task" menu 
		driver.findElement(By.cssSelector("#container_tasks")).click();
		//click on "Addnew" button
		driver.findElement(By.cssSelector(".title.ellipsis")).click();
		//click on option  "create new task" 
		driver.findElement(By.cssSelector(".item.createNewTasks")).click();
		//click on customer field

//		WebDriverWait wait=new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".customerSelector .selectedItem")));
//		driver.findElement(By.cssSelector(".customerSelector .selectedItem")).click();
//		driver.findElements(By.cssSelector(".customerSelector .searchItemList>div")).get(1).click();
		
		
		WebDriverWait wait2=new WebDriverWait(driver,20);
		wait2.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".projectSelector .selectedItem")));
		driver.findElement(By.cssSelector(".projectSelector .selectedItem")).click();
		driver.findElements(By.cssSelector(".projectSelector .searchItemList>div")).get(1).click();
		
		
		//Enter task name
		driver.findElements(By.cssSelector("input[placeholder='Enter task name']")).get(0).sendKeys("_234NEW__");
		//click on set deadline
		driver.findElements(By.cssSelector(".x-btn-text")).get(0).click();
		//click on calendar right arrow button
		driver.findElement(By.cssSelector("a[title=\"Next Month (Control+Right)\"]")).click();
		//select date in calendar
		driver.findElements(By.cssSelector(".x-date-inner .x-date-date")).get(20).click();
		//click on  type of work field
		driver.findElements(By.cssSelector(".taskTableContainer .value.ellipsis")).get(0).click();
		//select type of w ork
		driver.findElements(By.cssSelector(".taskTableContainer .typeOfWorkList>div>div")).get(9).click();
		//click on "create task" button
		driver.findElement(By.cssSelector(".basicLightboxFooter .components_button_label")).click();
		// select task to delete
		driver.findElements(By.cssSelector(".createdTasksTableContainer>table>tbody>tr:nth-of-type(1)>td>div")).get(0).click();
		//click on delete button
		WebDriverWait wait3=new WebDriverWait(driver,20);
		wait3.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".delete.button")));
		driver.findElement(By.cssSelector(".delete.button")).click();
		//confirm to delete 
		driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
		//close driver
		driver.close();
	}}
	

