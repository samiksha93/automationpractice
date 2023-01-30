package Webpages_actitime;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class ActiTimeHomePage extends SeleniumUtility {
	public ActiTimeHomePage(WebDriver driver ){
		PageFactory.initElements(driver,this);
	}
	@FindBy(css="#container_tasks")
	private WebElement taskMenu;
	
	@FindBy(css=".title.ellipsis")
	private WebElement addNewButton;
	
	@FindBy(css=".item.createNewTasks")
	private WebElement createNewTaskOption;
	
	@FindBy(css=".createdTasksTableContainer>table>tbody>tr:nth-of-type(1)>td>div")
	private List<WebElement> firstTaskCheckBox;
	
	@FindBy(css=".delete.button")
	private WebElement deleteButton;
	
	@FindBy(xpath="//span[text()='Delete permanently']")
	private WebElement confirmDeletePopup;
	
	public void tasksHomePageMethod() {
		performClick(taskMenu);
		performClick(addNewButton);
		performClick(createNewTaskOption);
	}

	public void deleteTaskMethod() {
		performClick(firstTaskCheckBox.get(0));
		performClick(deleteButton);
		performClick(confirmDeletePopup);
	}
}

